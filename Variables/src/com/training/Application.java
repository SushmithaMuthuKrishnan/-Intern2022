package com.training;

public class Application {

	public static void main(String[] args) {
		
		
		
		BankAccount account = new BankAccount("Ramesh",1000);
			System.out.println(account.getUpdatedBalance(2000));
			System.out.println(account.getAccountNumber());

			
			
		BankAccount account2 = new BankAccount("Suresh",2000);
			System.out.println(account2.getUpdatedBalance(2000));
			System.out.println(account2.getUpdatedBalance(1000));
			System.out.println(account2.getUpdatedBalance(5000));			
			System.out.println(account2.getAccountNumber());
	}

}
