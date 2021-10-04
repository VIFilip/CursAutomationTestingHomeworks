package bankSystem;

import curs6.MyCustomException;

public abstract class SavingsAccount extends Account {

	//setam in constructor variabilele
public SavingsAccount(String accountOwner, int accountNumber, double balance) {
		accountOwner = accountOwner;
		accountNumber = accountNumber;
		balance = balance;
	}
	
	@Override
	public abstract Withdraw() {//nu functioneaza cu override
		
		if(amount<balance) {
			throw InsuficientFundsException i
			System.out.println(i.printStackTrace());
		}else {
			amount - balance			
		}
		
		
	}
	

	
	
	
}

