public class SavingsAccount extends TheAccounts {

	private double minBalance;
	private double transactionFee;

	// Default constructor
	public SavingsAccount(CustomerClass customer) {
		super(customer); // Call the parent constructor with the customer object
		this.minBalance = 2000.0; //sets the minimum balance at 2000
		this.transactionFee = 1.25; //Transaction fee set at $1.25 for savings account
	}

	// Overloaded constructor uses values
	public SavingsAccount(CustomerClass customer, double balance) {
		super(customer);
		this.minBalance = 2000.0;
		this.transactionFee = 1.25;
		setBalance(balance);
	}


	// Method to withdraw from savings account with restrictions/rules
	public boolean withdraw(double amount) {

		if (getBalance() - amount > minBalance && amount > 0) {
			//this part withdraws if there is no transaction fee
			//as the balance is greater then 2000
			return super.withdraw(amount);

		} 

		else if (getBalance() < minBalance && amount > 0) {
			// this part takes out a fee from the balance if the balance is less then 2000
			return super.withdraw(amount + transactionFee);
		} 

		else {
			//provides an error message if it is not possible to withdraw the amount 
			//negative or insufficient funds 
			System.out.println("Withdrawal failed. Please check your balance and enter a valid amount.");

			return false;
		}
	}

	// toString method to add information
	public String toString() {
		return super.toString() + "\nMinimum Balance: " + minBalance + "\nTransaction Fee: " + transactionFee;
	}

	// Method to get customer information as a string
	public String getCustomerString() {
		CustomerClass customer = getCustomer();
		return "Customer: " + customer + "\nAddress: " + customer.getAddress() + "\nPhone: " + customer.getPhoneNumber();
	}

	// Method to get the account number as a string
	public String getAccountNumString() {
		return String.valueOf(generateAccountNumber());
	}

	// Main method for testing
	public static void main(String[] args) {

		// self testing main method

		// creating a test customer
		CustomerClass testCustomer = new CustomerClass("Gurvir", "Gill", "7 slime street", "647,555,1111");

		// Creating TheAccounts with the test customer
		TheAccounts testAccount = new SavingsAccount(testCustomer);

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

		//after the withdraw of 50 it also takes out the transaction fee
		//as the set balance for testing is bellow 2000
		if (testAccount.withdraw(withdrawalAmount)) {
			System.out.println("Successful Withdrawal of $" + withdrawalAmount);
		} 
		else {
			System.out.println("Withdrawal failed, please enter a valid amount.");
		}

		// Displaying updated account information
		System.out.println("\nUpdated/New Account Information:");
		System.out.println(testAccount);

		//display of the transaction fee and min balance is not needed 
		//but it can be used in other parts of program





	}
}




