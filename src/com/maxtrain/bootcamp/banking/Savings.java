package com.maxtrain.bootcamp.banking;

public class Savings extends Account { // Defines that Savings class inherits Account
	
	private double interestRate = .12;

	public void calculateAndPayInterest(int months) throws Exception {
		if(months <= 0) {
			throw new Exception("Months must be greater than zero");
		}
		var interestToBePaid = getBalance() * (getInterestRate() / 12) * months;
		try {
			deposit(interestToBePaid);
		} catch(Exception ex) {}
	}
	
	public Savings(String description) {
		super(description); // super references parent class similar to how base is used in C#
		setAccountNo(getAccountNo() + 10000);
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	public void setInterestRate(double interestRate) throws Exception {
		if(interestRate < 0) {
			throw new Exception("Interest Rate cannot be negative");
		}
		this.interestRate = interestRate;
	}
	
}
