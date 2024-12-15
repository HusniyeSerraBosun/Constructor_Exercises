package account;

public class Account {
	private String accountNumber;
	private double balance;
	
	public Account(String accountNumber,double balance) {
		if (accountNumber==null || accountNumber.isEmpty()) {
			//throw new IllegalArgumentException("Account number cannot be empty or null!");
			
			System.err.println("ERROR: Account number cannot be empyt or null !");
			return;
		}
		this.accountNumber=accountNumber;
		
		if (balance<0) {
			//throw new IllegalArgumentException("ERROR: Balance cannot negative !");
			
			System.err.println("ERROR: Balance cannot negative !");
			return;
		}
		this.balance=balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
}
