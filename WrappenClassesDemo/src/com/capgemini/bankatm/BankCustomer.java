package com.capgemini.bankatm;

import java.util.Scanner;

public class BankCustomer extends ATM{
	private static String customername;
	private static String address;
	private static String email;
	
	public BankCustomer(String location, String branchname, String customername, String address, String email) {
		super(location, branchname);
		this.setCustomername(customername);
		this.setAddress(address);
		this.setEmail(email);
	}
	
	void insertcard() {
		System.out.println("Card inserted for customer... "+this.getCustomername());
	}

	void startransaction() {
		System.out.println("transaction started... "+this.getCustomername()+","+this.getAddress()+","+this.getEmail());
	}
	void enterpin(int pin) {
		System.out.println("pin="+pin);
	}
	void changepin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new pin=");
		int newpin=sc.nextInt();
		System.out.println("New pin="+newpin);
	}
	void withdrawcash() {
		System.out.println("Cash withdrawn=");
	}
	void requesttransactionsummary() {
		withdrawcash();
		
	}
	void acceptamount() {
		System.out.println("Amount accpeted=");
		
	}

	public static String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public static String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

