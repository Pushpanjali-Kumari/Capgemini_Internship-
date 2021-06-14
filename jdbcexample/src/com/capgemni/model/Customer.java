package com.capgemni.model;

public class Customer {
	private String custId;
	private String custName;
	private String custEmail;
	private String custPassword;
	private String custPhoneNumber;
	private double custWallet;
	private String custOrderStatus;
	private String custOrderHistory;
	private String custMenuItem;
	
	Customer(){
		
	}


	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getCustWallet() {
		return custWallet;
	}

	public void setCustWallet(double custWallet) {
		this.custWallet = custWallet;
	}

	public String getCustOrderStatus() {
		return custOrderStatus;
	}

	public void setCustOrderStatus(String custOrderStatus) {
		this.custOrderStatus = custOrderStatus;
	}

	public String getCustOrderHistory() {
		return custOrderHistory;
	}

	public void setCustOrderHistory(String custOrderHistory) {
		this.custOrderHistory = custOrderHistory;
	}

	public String getCustMenuItem() {
		return custMenuItem;
	}

	public void setCustMenuItem(String custMenuItem) {
		this.custMenuItem = custMenuItem;
	}



	public String getCustEmail() {
		return custEmail;
	}



	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}



	public String getCustPhoneNumber() {
		return custPhoneNumber;
	}



	public void setCustPhoneNumber(String custPhoneNumber) {
		this.custPhoneNumber = custPhoneNumber;
	}



	public String getCustPassword() {
		return custPassword;
	}



	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	
	
	
}

