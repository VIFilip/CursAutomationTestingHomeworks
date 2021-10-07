package bankSystem;

import curs6.MyCustomException;

public  class SavingsAccount extends Account {

	//setam in constructor variabilele
	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
	    super(accountNumber, balance, accountOwner);
	}
	
	@Override
	public void withdraw(double sum) throws InsuficientFundsException {
	    if(getBalance() < sum) {
	        throw new InsuficientFundsException("Insufficient funds for transaction.");
	    } else {balance = balance-sum;}
	}
		
		
	}
	

	
	
	


