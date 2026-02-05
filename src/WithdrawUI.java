import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WithdrawUI extends JFrame implements ActionListener{

	/**
	 * Private Instance Variables
	 */
	private JPanel drawingPanel, controlPanel; // panels to separate the frame into multiple part
	private int width, height; // height and width of frame
	private ImagePicture logo, background, background2, logo2; // logo for the gui
	private JButton btnBack, btnDep, btnWith, btnCheck, btnSave; // initialize variables for buttons
	private Color turquoise  = new Color(86,188,190,255);
	private JTextField fieldDep, fieldPass;
	private TextPicture welcome;

	/**
	 * 
	 */
	public WithdrawUI() {
		super("MSG Bank");  //Title for the frame

		//dimensions of the window
		width = 550;
		height = 380;

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
		logo.setBounds(30, -15, drawingPanel.getWidth(), drawingPanel.getHeight());
		drawingPanel.add(logo);

		fieldDep = new JTextField();
		fieldDep.setText("Withdraw Amount");
		fieldDep.setForeground(turquoise);
		fieldDep.setBounds(165,270,105,25);
		
		welcome = new TextPicture("Enter The Amount You Want To Withdraw", 50, 30);
		welcome.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 0));
		welcome.setBounds(-40, 225, 600, 40);
		welcome.setColor(turquoise);
		drawingPanel.add(welcome);

		btnDep = new JButton("Withdraw");
		btnDep.setFont(new Font("Arial", Font.BOLD, 14));
		btnDep.setBackground(turquoise); // Light blue background
		btnDep.setForeground(Color.BLACK); // Black text
		btnDep.addActionListener(this); // Register ActionListener
		btnDep.setBounds(275,270,100,25);
		
		btnBack = new JButton("Go Back");
		btnBack.setFont(new Font("Arial", Font.BOLD, 14));
		btnBack.setBackground(turquoise); // Light blue background
		btnBack.setForeground(Color.BLACK); // Black text
		btnBack.addActionListener(this); // Register ActionListener
		btnBack.setBounds(205,305,125,25);


		drawingPanel.add(fieldDep);
		drawingPanel.add(btnDep);
		drawingPanel.add(btnBack);

		//sets frame as visible
		setVisible(true);
		setResizable(false); 
		//sets conditions to close the tab
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	// method for actions events
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnWith) {
			
		}
		
		else if (e.getSource() == btnBack) {
			setVisible(false);
			UserInterfaceMenu animation = new UserInterfaceMenu();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Call on constructor
		WithdrawUI animation = new WithdrawUI();

	}

}
