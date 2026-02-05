import javax.swing.JOptionPane;


public class CustomerClass {

	/**
	 * Instance data/Attributes
	 */

	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;


	/**
	 * Default Constructor
	 */
	public void Customer() {
		this.firstName = "";
		this.lastName = "";
		this.address = "";
		this.phoneNumber = "";
	}

	//Overload constructor to initialize all attributes
	public CustomerClass(String firstName, String lastName, String address, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}



	/**
	 * @return the Address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void updateInfo(String firstName, String lastName, String address, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	//toString Method 
	public String toString() {
		return "Customer Info" + "\n" +
				"First Name = " + firstName + "\n" +
				"Last Name = " + lastName + "\n" +
				"Address = " + address + "\n" +
				"Phone Number = " + phoneNumber + "\n" 
				;
	}

	/**
	 * Self Testing Main
	 */
	public static void main(String[] args) {
		// Create a customer using the default constructor
		CustomerClass Customer = new CustomerClass("","","","");

		// Create a customer using the overloaded constructor
		CustomerClass testCustomer = new CustomerClass("John", "Doe", "123 Main St", "647-003-3132");
		JOptionPane.showMessageDialog(null,"\nTest Customer Information:");
		JOptionPane.showMessageDialog(null,testCustomer);

	}



}










