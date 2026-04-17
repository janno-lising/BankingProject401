
abstract class Account {
	private int accountID;
	protected double balance;
	private boolean isFrozen;
	public static int accountIDCounter = 0;
	protected accountType accType;

	public Account(accountType aType){
		balance = 0;
		isFrozen = false;
		accountID = accountIDCounter++;
		accType = aType;
	}
	
	public int getAccountID() {
		return accountID;
	}
	public void freeze() {
		isFrozen = true;
	}
	public void thaw() {
		isFrozen = false;
	}
	public double getBalance(){
		return balance;
	}
	// deposit and withdrawal fnctions may be a little different for credit vs savings/checkings...
	public abstract boolean withdrawal(double amount);
	public abstract boolean deposit(double amount);
}
