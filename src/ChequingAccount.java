public class ChequingAccount extends TheAccounts {


	/**
	 * Instance data/Attributes
	 */

	private double withdrawalFee;
	private double depositFee;

	/**
	 *Default constructor 
	 */
	public ChequingAccount() {
		// call account class
		super();
		this.withdrawalFee = 0.5;
		this.depositFee = 1.50;

	}

	/**
	 *Overload Constructor
	 */
	public ChequingAccount(CustomerClass customer) {
		super();
		withdrawalFee = 0.5;
		depositFee = 1.50;
	}

	/**
	 *  withdraw method
	 */
	public boolean withdraw (double amt){
		// checks if balance is sufficient
		if ((amt <= getBalance()) && (amt > 0)) {
			withdrawalFee = (amt* withdrawalFee);
			return true ;
		}
		return false; 	
	}

	public boolean deposit (double amt)
	{
		// checks if balance is sufficient
		if  (amt > 0) {
			super.deposit(amt - depositFee);
			// returns true if successful and false if not
			return true ;	// if the deposit is successful
		}
		{
			return false; 	// deposit amount is under 0, a neg int
		}
	}

	// getters and setters as needed
	public double getWithdrawalFee() {
		return withdrawalFee;
	}
	public void setWithdrawalFee(double withdrawalFee) {
		this.withdrawalFee = withdrawalFee;
	}
	public double getDepositFee() {
		return depositFee;
	}
	public void setDepositFee(double depositFee) {
		this.depositFee = depositFee;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a ChequingAccount instance
        ChequingAccount account = new ChequingAccount();

        // Test deposit
        System.out.println("Testing deposit...");
        boolean depositResult = account.deposit(100); // Expect true
        System.out.println("Deposit 100: " + depositResult + " (Expected: true)");
        System.out.println("Balance after deposit: " + account.getBalance() + " (Expected: 98.5)");

        // Test withdrawal
        System.out.println("Testing withdrawal...");
        boolean withdrawResult = account.withdraw(50); // Expect true
        System.out.println("Withdraw 50: " + withdrawResult + " (Expected: true)");
        System.out.println("Balance after withdrawal: " + account.getBalance() + " (Expected: 48.25)");

        // Test insufficient funds for withdrawal
        System.out.println("Testing insufficient funds for withdrawal...");
        withdrawResult = account.withdraw(100); // Expect false
        System.out.println("Withdraw 100: " + withdrawResult + " (Expected: false)");
        System.out.println("Balance after trying to withdraw 100: " + account.getBalance() + " (Expected: 48.25)");

	}

}
