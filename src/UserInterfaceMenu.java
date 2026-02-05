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

public class UserInterfaceMenu extends JFrame implements ActionListener{

	/**
	 * Private Instance Variables
	 */
	private JPanel drawingPanel, controlPanel; // panels to separate the frame into multiple part
	private int width, height; // height and width of frame
	private ImagePicture logo, background, background2, logo2; // logo for the gui
	private JButton btnBack, btnDep, btnWith, btnCheck, btnSave; // initialize variables for buttons
	private Color turquoise  = new Color(86,188,190,255);
	private JTextField fieldLog, fieldPass;
	private TextPicture welcome;



	public UserInterfaceMenu() {
		super("MSG Bank");  //Title for the frame

		//dimensions of the window
		width = 985;
		height = 640;

		//set size and location of frame
		setSize(width, height);
		setLocation(200, 15);

		setLayout(null);  // layout for my frame

		controlPanel = new JPanel();  // panel for buttons
		drawingPanel = new JPanel(); // used only to set the boundaries to draw

		//adds panels to frame
		add(controlPanel); 
		add(drawingPanel);

		// set the size and position of the panels
		drawingPanel.setBounds(0, 0, width, height);
		controlPanel.setBounds(260, 250, 450, 600);
		drawingPanel.setLayout(null);  // set layout of drawing panel

		//create an image picture object for the logo
		logo = new ImagePicture(new ImageIcon("MSGLogo.png"));
		logo.setBounds(drawingPanel.getWidth()/4, 0, drawingPanel.getWidth(), drawingPanel.getHeight());
		drawingPanel.add(logo);

		//create an image picture object for the background
		background = new ImagePicture(new ImageIcon("background2.jpg"));
		background.setBounds(260, 0, 450, 700);
		drawingPanel.add(background);

		for (int i = 0; i < 750; i = i + 75) {
			background(-203,-45 + i);
			background(-203 + 75,-45 + i);
			background(-203 + 150,-45 + i);
			background(-203 + 225,-45 + i);
		}

		for (int i = 0; i < 750; i = i + 75) {
			background(470,-45 + i);
			background(470 + 75,-45 + i);
			background(470 + 150,-45 + i);
			background(470 + 225,-45 + i);
		}

		//create an image picture object for the background
		background2 = new ImagePicture(new ImageIcon("background.jpg"));
		background2.setBounds(0, 0, width, height);
		drawingPanel.add(background2);

		btnDep = new JButton("Deposit Money");
		btnDep.setFont(new Font("Arial", Font.BOLD, 14));
		btnDep.setBackground(turquoise); // Light blue background
		btnDep.setForeground(Color.BLACK); // Black text

		btnWith = new JButton("Withdraw Money");
		btnWith.setFont(new Font("Arial", Font.BOLD, 14));
		btnWith.setBackground(turquoise); // Light blue background
		btnWith.setForeground(Color.BLACK); // Black text

		btnSave = new JButton("Check Savings");
		btnSave.setFont(new Font("Arial", Font.BOLD, 14));
		btnSave.setBackground(turquoise); // Light blue background
		btnSave.setForeground(Color.BLACK); // Black text

		btnCheck = new JButton("Check Checkings");
		btnCheck.setFont(new Font("Arial", Font.BOLD, 14));
		btnCheck.setBackground(turquoise); // Light blue background
		btnCheck.setForeground(Color.BLACK); // Black text

		btnBack = new JButton("Logout");
		btnBack.setFont(new Font("Arial", Font.BOLD, 14));
		btnBack.setBackground(turquoise); // Light blue background
		btnBack.setForeground(Color.BLACK); // Black text    

		//Adds the ActionListener to the buttons
		btnDep.addActionListener(this);
		btnWith.addActionListener(this);
		btnSave.addActionListener(this);
		btnCheck.addActionListener(this);
		btnBack.addActionListener(this);
		
		controlPanel.add(btnDep);     
		controlPanel.add(btnWith);
		controlPanel.add(btnSave);     
		controlPanel.add(btnCheck);
		controlPanel.add(btnBack); 

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

		    if (e.getSource() == btnDep) {
		    	setVisible(false);
		    	//Call on constructor
		    	ChooseAccountDep animation  =  new ChooseAccountDep();

		    }

		    else if (e.getSource() == btnWith) {
		    	setVisible(false);
		    	//Call on constructor
		    	ChooseAccountWith animation  =  new ChooseAccountWith();
		    }

		    else if (e.getSource() == btnSave) {
		        // Code to handle the "Exit" button click
		       
		    }
		    
		    else if (e.getSource() == btnCheck) {
		        // Code to handle the "Exit" button click
		       
		    }
		    
		    else if (e.getSource() == btnBack) {
		    	// Make UserInterfaceMenu window not visible
		        setVisible(false);
		    	//Call on constructor
		        UserInterfaceLogin animation = new UserInterfaceLogin();
		       
		    }
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Call on constructor
		UserInterfaceMenu animation = new UserInterfaceMenu();

	}

}
