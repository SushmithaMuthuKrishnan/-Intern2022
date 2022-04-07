package com.training;

public class BankAccount {
	//Static variable
	private static int count;
	//Instance variable
	private String accountHolder;
	private double balance;
	private int accountNumber;
	
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	
	
	
	//static method
	public static int getCount()
	{
		return ++count;
	}
		
	

	
	public double getUpdatedBalance(double amount)
	{
		//local variable
		double updatedBalance;
		//local variable
		double currentBalance=0;
		//Local variables should be initialized before using
		//System.out.println(updatedBalance);
		
		currentBalance = this.balance+amount;
		this.balance=currentBalance;
		return currentBalance;
		// also written as this.balance=this.balance+amount and 
		//return this.balance
	}

	
	
	
	
	
	public String getAccountHolder() {
		return accountHolder;
	}

	//public void setAccountHolder(String accountHolder) {
	//	this.accountHolder = accountHolder;
	//}

	
	
	
	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
	
	
	public BankAccount(String accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.accountNumber=getCount();
	}
	
	
	
	//constructor with one parameter for bankAccount
	
	public BankAccount(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	
	
	
	

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
}
