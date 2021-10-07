package bankSystem;

import java.util.Scanner;

import curs6.AgeVerifier;
import curs6.MyCustomException;

public class TestSavingsAccount {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer("John", "Cluj-Napoca", "John@gmail.com");
		
		
		System.out.println("Hi " + customer.getName());
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the amount to withdraw:");		
		double amount =  scan.nextDouble();
		scan.close();
		SavingsAccount savings = new SavingsAccount(121231, 250, customer);

		try {
		    savings.withdraw(amount);
		    if(savings.balance - amount >= 0) {

		        System.out.println("Please pick up your money");
		        System.out.println("Your new balance is: " + savings.balance);
		        System.out.println("Thank you for using our ATM!");

		    }else {

		        System.out.println("The amount you entered is greater than the available balance: " + savings.balance);
		        System.out.println("Thank you for using our ATM");

		    }
			
			
		} catch (InsuficientFundsException e) {
			System.out.println("The amount you entered is greater than the available balance: " + savings.balance);
			
			e.printStackTrace();
		}

	}
		
		
		
		
}	
	
	

