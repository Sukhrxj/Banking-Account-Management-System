import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserInterfaceCreate2 extends JFrame implements ActionListener{

	private JPanel drawingPanel, controlPanel; // panels to separate the frame into multiple part
	private int width, height; // height and width of frame
	private ImagePicture logo, background, background2, logo2; // logo for the gui
	private JButton btnCreate, btnExit; // initialize variables for buttons
	private Color turquoise  = new Color(86,188,190,255);
	private JTextField fieldCheck, fieldSav, fieldId, fieldPass;
	private TextPicture welcome;

	/**
	 * 
	 */
	public UserInterfaceCreate2() {
		super("MSG Bank");  //Title for the frame

		//dimensions of the window
		width = 500;
		height = 450;

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

		fieldId = new JTextField();
		fieldId.setText("Please Enter Your Login Id");
		fieldId.setBounds(45,250,195,25);
		fieldId.setForeground(turquoise);

		fieldPass = new JTextField();
		fieldPass.setText("Please Enter Your Passsword");
		fieldPass.setBounds(250,250,195,25);
		fieldPass.setForeground(turquoise);

		fieldCheck = new JTextField();
		fieldCheck.setText("Please Enter Your Initial Balance For Checkings");
		fieldCheck.setBounds(110,290,270,25);
		fieldCheck.setForeground(turquoise);

		fieldSav = new JTextField();
		fieldSav.setText("Please Enter Your Initial Balance For Savings");
		fieldSav.setBounds(110,320,270,25);
		fieldSav.setForeground(turquoise);

		btnCreate = new JButton("Create Account");
		btnCreate.setFont(new Font("Arial", Font.BOLD, 14));
		btnCreate.setBackground(turquoise); // Light blue background
		btnCreate.setForeground(Color.BLACK); // Black text
		btnCreate.addActionListener(this); // Register ActionListener
		btnCreate.setBounds(165,365,150,25);

		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Arial", Font.BOLD, 14));
		btnExit.setBackground(turquoise); // Light blue background
		btnExit.setForeground(Color.BLACK); // Black text
		btnExit.addActionListener(this); // Register ActionListener
		btnExit.setBounds(400,365,75,25);

		drawingPanel.add(fieldId);
		drawingPanel.add(fieldPass);
		drawingPanel.add(fieldCheck);
		drawingPanel.add(fieldSav);
		drawingPanel.add(btnCreate);
		drawingPanel.add(btnExit);

		//sets frame as visible
		setVisible(true);
		setResizable(false); 
		//sets conditions to close the tab
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	


	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnCreate) {
			String Id = fieldId.getText();
			String Password = fieldPass.getText();
			//int Checkings = Integer.parseInt(fieldCheck.getText());
			//int Savings = Integer.parseInt(fieldPass.getText());
			
			TheAccounts testAccount = new TheAccounts(Customer);
			
			setVisible(false);
			UserInterfaceLogin animation = new UserInterfaceLogin();
		}
		
		if (e.getSource() == btnExit) {
			setVisible(false);
		}

	}

	public void background(int x, int y) {
		//create an image picture object for the background
		logo2 = new ImagePicture(new ImageIcon("test.png"));
		logo2.setBounds(x, y, 300, 300);
		drawingPanel.add(logo2);
	}
	

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserInterfaceCreate2 animation = new UserInterfaceCreate2();

	}


}
