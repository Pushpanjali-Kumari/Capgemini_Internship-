package com.capgemini.bankatm;

import java.util.Date;

public class Transaction {
	private Date date;
	private double amount;
	
	public Transaction(Date date, double amount) {
		super();
		this.date = date;
		this.amount = amount;
	}
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	void starttransaction() {
		System.out.println("Transaction started on "+this.date+" with amount= "+this.amount);
	}
	
	double calculatebalance(double balance ) {
		return amount-balance;
		
	}
	
	double getaccountbalance(double rembalance) {
		double accountbalance=rembalance;
		return accountbalance;
		
	}

	void canceltransaction(double accountbalance) {
		System.out.println("Transaction cancelled on "+this.date+" with amount= "+accountbalance);
	}
}
