package com.capgemini.bankatm;

import java.util.Scanner;

public class Account extends Transaction{
	public Account() {
		super();
	}

	private int accountnumber;
	private double balance;
	private Transaction trans;
	Scanner sc=new Scanner(System.in);
	
	void calculateinterest() {
		System.out.println("Interest: "+trans.calculatebalance(2000)/1000);
	}
	
	void updateaccount() {
		System.out.println("Enter new account number=");
		int newaccountnumber=sc.nextInt();
		this.accountnumber=newaccountnumber;
		System.out.println("Account updated=");
	}
	
	void verifywithdrawamount() {
		System.out.println("Amount verified=");
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
