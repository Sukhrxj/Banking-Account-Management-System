import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ImagePicture extends Picture{

	/**
	 * Private Instance Variable
	 */

	private ImageIcon image; //for storing image

	/**
	 * 
	 */
	public ImagePicture(ImageIcon img) {


		//call the super class constructor
		super();
		this.image = img;
		setMyWidth(img.getIconWidth());
		setMyHeight(img.getIconHeight());

	}

	/**
	 * Overloaded constructor
	 */

	public ImagePicture(ImageIcon img, int x, int y) {
		//call the parent constructor
		super(x, y, img.getIconWidth(), img.getIconHeight());
		this.image = img;
	}

	/**
	 * @return the image
	 */
	public ImageIcon getImage() {
		return image;
	}

	/**
	 * Override the paint from picture
	 */
	public void paint (Graphics g) {
		//paint the image
		this.image.paintIcon(this, g, getxPosition(), getyPosition());
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(ImageIcon image) {
		this.image = image;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create a JFrame for testing
		JFrame f = new JFrame("Testing Only");

		//set the size of frame
		f.setSize(400,350);

		//create and image picture object
		ImagePicture p = new ImagePicture(new ImageIcon("minion.png"));

		//add p to my frame
		f.add(p);

		//show my frame
		f.setVisible(true);

		//change position of p
		p.setxPosition(200);

		p.repaint();

		//create and image picture object
		ImagePicture p1 = new ImagePicture(new ImageIcon("Captain (2).png"), 50, 100);

		//add p to my frame
		f.add(p1);

		//show my frame
		f.setVisible(true);

		//Wait!!
		JOptionPane.showMessageDialog(null,  "Wait!");
		
		//test the setImage to change the image of p
		p.setImage(new ImageIcon("gru.png"));
		
		//repaints frame
		p.repaint();

	}

}
