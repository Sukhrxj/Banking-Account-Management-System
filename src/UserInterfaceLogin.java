import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class UserInterfaceLogin extends JFrame implements ActionListener{

	/**
	 * Private Instance Variables
	 */
	private JPanel drawingPanel, controlPanel; // panels to separate the frame into multiple part
	private int width, height; // height and width of frame
	private ImagePicture logo, background, background2, logo2; // logo for the gui
	private JButton btnLog, btnExit; // initialize variables for buttons
	private Color turquoise  = new Color(86,188,190,255);
	private JTextField fieldLog, fieldPass;
	private TextPicture wrong;
	private String user = "Sukhraj"; String pass = "20060807";



	public UserInterfaceLogin() {
		super("MSG Bank");  //Title for the frame
		//dimensions of the window
				width = 500;
				height = 350;

				//set size and location of frame
				setSize(width, height);
				setLocation(200, 15);

				setLayout(null);  // layout for my frame

				drawingPanel = new JPanel(); // used only to set the boundaries to draw

				//adds panels to frame
				add(drawingPanel);

				// set the size and position of the panels
				drawingPanel.setBounds(0, 0, width, height);
				drawingPanel.setLayout(null);  // set layout of drawing panel

				//create an image picture object for the logo
				logo = new ImagePicture(new ImageIcon("MSGLogo.png"));
				logo.setBounds(0, -15, drawingPanel.getWidth(), drawingPanel.getHeight());
				drawingPanel.add(logo);

				fieldLog = new JTextField();
				fieldLog.setText("Please Enter Your Name");
				fieldLog.setBounds(45,250,195,25);
				fieldLog.setForeground(turquoise);

				fieldPass = new JTextField();
				fieldPass.setText("Please Enter Your Phone Number");
				fieldPass.setBounds(250,250,195,25);
				fieldPass.setForeground(turquoise);

				btnLog = new JButton("Login");
				btnLog.setFont(new Font("Arial", Font.BOLD, 14));
				btnLog.setBackground(turquoise); // Light blue background
				btnLog.setForeground(Color.BLACK); // Black text
				btnLog.addActionListener(this); // Register ActionListener
				btnLog.setBounds(205,280,75,25);
				
				btnExit = new JButton("Exit");
				btnExit.setFont(new Font("Arial", Font.BOLD, 14));
				btnExit.setBackground(turquoise); // Light blue background
				btnExit.setForeground(Color.BLACK); // Black text
				btnExit.addActionListener(this); // Register ActionListener
				btnExit.setBounds(400,280,75,25);

				drawingPanel.add(fieldLog);
				drawingPanel.add(fieldPass);
				drawingPanel.add(btnLog);
				drawingPanel.add(btnExit);

				//sets frame as visible
				setVisible(true);
				setResizable(false); 
				//sets conditions to close the tab
				setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void background(int x, int y) {
		//create an image picture object for the background
		logo2 = new ImagePicture(new ImageIcon("test.png"));
		logo2.setBounds(x, y, 300, 300);
		drawingPanel.add(logo2);
	}

	// method for actions events
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnLog) {
			if (fieldLog.getText().equalsIgnoreCase("Sukhraj")) {
				if (fieldPass.getText().equalsIgnoreCase("20060807")) {
					setVisible(false);
					UserInterfaceMenu animation = new UserInterfaceMenu();
				}

				else if (!fieldLog.getText().equalsIgnoreCase("Sukhraj") || !fieldPass.getText().equalsIgnoreCase("20060807")){
						// DOES NOT WORK
						wrong = new TextPicture("Error! Wrong Username or Password Entered", 50, 30);
						wrong.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 24));
						wrong.setBounds(50, 225, 600, 40);
						wrong.setColor(turquoise);
						drawingPanel.add(wrong);
						JOptionPane.showMessageDialog(null,  "Error");
						
					}
				}


			}
		
		if (e.getSource() == btnExit) {
			setVisible(false);
		}
		
		}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Call on constructor
		UserInterfaceLogin animation = new UserInterfaceLogin();

	}

}
