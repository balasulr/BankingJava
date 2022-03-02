package com.maxtrain.bootcamp.banking;

public class Account {
	
	private static int nextAccountNo = 1;
	// Field (like a property but lower case)
	private int accountNo;
	private String description;
	private double balance;
	// Methods
	public void deposit(double amount) throws Exception {
		if(amount <= 0) {
			throw new Exception("Amount must be greater than zero!");
		}
		//double sum = amount + getBalance(); //// getBalance is reading the current value of Balance
		setBalance(getBalance() + amount); //// With above, this statement would be setBalance(sum)
	}
	public void withdraw(double amount) throws Exception {
		if(amount <= 0) {
			throw new Exception("Amount must be greater than zero!");
		}
		if(amount > getBalance()) {
			throw new Exception("Insufficient funds!");
		}
		setBalance(getBalance() - amount);
	}
	
	public void transfer(double amount, Account toAccount) throws Exception {
		this.withdraw(amount);
		toAccount.deposit(amount);
	}
	
	public String toString() { // String concatenation
		var message = "accountNo    = " + this.getAccountNo() + "\n"
					+ "description  = " + this.getDescription() + "\n"
					+ "balance      = " + this.getBalance();
		return message;
	}
	public Account() { // Default Constructor
	}
	public Account(String description) { // Constructor that allows to be able to put in description
		this.setAccountNo(this.nextAccountNo++);
		this.setDescription(description);
		try {
			this.setBalance(0);	
		} catch(Exception ex) {}
	}
	
	
	
	public int getAccountNo() { // Getter with the Same name as field but capitalized
		return accountNo;
	}
	protected void setAccountNo(int accountNo) { // protected allows Savings to access since is inherited, but not Program.java
		this.accountNo = accountNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) { // Setter - how a outside class can change the value
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	private void setBalance(double balance) throws Exception {
		if(balance < 0) {
			throw new Exception("Balance must be greater than zero!");
		}
		this.balance = balance;
	}
}
