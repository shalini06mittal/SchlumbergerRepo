package com.oops;

/**
 * Create a class Account with foll data members
 * name, accno, balance
 * Account() => default constructor with initial balance as 1000
 * Account(accno, name) => parameterized constructor takes name and accno and calls default constructor for default balance
 * Account(accno, name, balance) => parameterized constructor takes name, accno and balance for different initial balance
 * boolean withdraw(amt) => check if amt > and balance and after deduction the balance in the account should be 1000 then allow 
 * to withdraw and update balance accordingly and return true. Else return false
 * void deposit(amt)=> to deposit amount in the account
 * transfer(Account a2, amt)=> to transfer amount from 1 account to a2 with the amt. Check if withdraw possible
 * from 1st account then only deduct from account 1 and deposit in account 2 else display an error message cannot transfer
 * Reuse the withdraw ceated in transfer()
 * 
 * Create 2 objects and transfer money from 1 acc to another
 * 
 */
public class Account {

	private int accno;
	private String name;
	private double balance;
	
	public Account() {
		balance = 1000;
	}

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public Account(int accno, String name) {
		this();
		this.accno = accno;
		this.name = name;
	}
	public boolean withdraw(double amt)
	{
		if(amt < balance && balance - amt >1000) {
			balance -= amt;
			return true;
		}
		return false;	
	}
	public void deposit(double amt)
	{
		balance += amt;
	}
	public void transfer(Account a2, double amt) {
		if(withdraw(amt)) {
			a2.deposit(amt);;
		}
		else
			System.out.println("Could not transfer, connect with bank");
	}
	public double getBalance()
	{
		return balance;
	}
	
}
