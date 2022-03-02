package com.maxtrain.bootcamp.testing;

import com.maxtrain.bootcamp.banking.Checking;
//import com.maxtrain.bootcamp.banking.Account; //// Says can use all classes in this package
//import com.maxtrain.bootcamp.banking.Savings;

public class Program {

	public static void main(String[] args) {
		
		try {
			
			var checking1 = new Checking("My first checking");
			checking1.deposit(200);
			checking1.writeCheck(3737, 300);
			checking1.writeCheck(4433, 400);
			System.out.println(checking1);
			
			/*
			var savings1 = new Savings("My first savings");
			savings1.deposit(100);
			savings1.calculateAndPayInterest(6);
			System.out.println(savings1);
			

			var account1 = new Account("My first account");
			account1.deposit(500);
			System.out.println(account1.toString());
			
			var account2 = new Account("My second account");
			account2.deposit(1000);
			account2.withdraw(350);
			System.out.println(account2.toString());
			
			try {
				account2.withdraw(700);
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			
			account2.transfer(150, account1);
			System.out.println(account1.toString());
			System.out.println(account2.toString());
			 */			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

}
