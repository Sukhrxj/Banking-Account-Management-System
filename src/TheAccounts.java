import java.util.Random;


public class TheAccounts {

	/**
	 * instance data/attributes 
	 */
	private long accountNumber;
	private CustomerClass customer;
	private double balance;

	// Default constructor
	public TheAccounts() {
		//initializes the balance
		// initializes the balance
		this.balance = 0.0;

		// generates an account number
		this.accountNumber = generateAccountNumber();

		// initializes Customer object (assuming you have a Customer class)
		this.customer = new CustomerClass("","","","");


	}

	// Overloaded Constructor 
	public TheAccounts (CustomerClass theOwner) {
		//initializes balance
		this.balance = 0.0;
		// generates an account number
		this.accountNumber = generateAccountNumber();
		// initializes customer object theOwner
		this.customer = theOwner;

	}

	//Deposit method
	public boolean deposit (double amount) {
		// deposits amount into balance
		// checks if balance is sufficient
		if  (amount > 0) {
			balance = balance + amount;
			// returns true if successful and false if not

			return true ;	// if the deposit is successful
		}

		{
			System.out.println("please enter a valid amount to deposit!");
			return false; 	// deposit amount is less then 0 therefore there is no deposit


			// returns true if deposit is successful and false if it is not
		}

	}

	public boolean withdraw (double amount)  {
		// Checks if the amount can be withdrawn
		if (amount > 0 && amount <= balance) { //checks is the amount is negative and
			//also checks is the amount is less then or equal to balance to withdraw
			balance = balance - amount; //changes balance after withdraw 
			return true;
		}
		else {
			System.out.println("Please enter a valid amount to withdraw!");
			return false;
		}


		//returns true if it is possible and false if it is not

		//updates balance
	}



	//method to generate account number of 12 digits 
	//Did research to create this method used 
	//https://www.educative.io/answers/how-to-generate-random-numbers-in-java
	public long generateAccountNumber() {
		//add method to generate a random number 
		Random random = new Random();
		return 100000000000L + random.nextInt(900000000);

	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public CustomerClass getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerClass customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Method to change the customer object
	public void changeCustomer(CustomerClass newCustomer) {
		this.customer = newCustomer;
	}

	// Method to retrieve the customer object
	//old / other
	public CustomerClass retrieveCustomer() {
		return customer;
	}

	// ToString method
	public String toString() {
		return "Account Number: " + accountNumber +
				"\nCustomer: " + customer +
				"\nBalance: " + balance;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// self testing main method

		// creating a test customer
		CustomerClass testCustomer = new CustomerClass("Gurvir", "Gill", "7 slime street", "647,555,1111");

		// Creating TheAccounts with the test customer
		TheAccounts testAccount = new TheAccounts(testCustomer);

		// displays account information
		System.out.println("Account Information:");
		System.out.println(testAccount);

		// tests deposit of 100$
		//also already tested for negative value 
		double depositAmount = 100.0;
		if (testAccount.deposit(depositAmount)) {
			System.out.println("Succcessful Deposit of $" + depositAmount);
		} 
		else {
			System.out.println("Deposit failed, please enter a valid amount");
		}

		// tests deposit of 50$
		//also already tested for negative value and 
		//value that is below the balance amount
		double withdrawalAmount = 50.0;

		if (testAccount.withdraw(withdrawalAmount)) {
			System.out.println("Successful Withdrawal of $" + withdrawalAmount);
		} 
		else {
			System.out.println("Withdrawal failed, please enter a valid amount.");
		}

		// Displaying updated account information
		System.out.println("\nUpdated/New Account Information:");
		System.out.println(testAccount);







	}

}



