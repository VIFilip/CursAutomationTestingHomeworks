package bankSystem;

public abstract class Account {

	private int accountNumber;
	double balance;
	Customer accountOwner;
	
	public Account (int accountNumber, double balance, Customer accountOwner) {
	    setAccountNumber(accountNumber);
	    setBalance(balance);
	    setAccountOwner(accountOwner);
	}

	abstract public void withdraw(double amount) throws InsuficientFundsException;
	
	
	


	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public Customer getAccountOwner() {
		return accountOwner;
	}



	public void setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner;
	}

	
	
	
}


