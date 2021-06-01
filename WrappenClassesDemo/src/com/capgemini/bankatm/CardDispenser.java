package com.capgemini.bankatm;

public class CardDispenser extends ATM {
	public CardDispenser(String location, String branchname) {
		super(location, branchname);
		// TODO Auto-generated constructor stub
	}
	
	private float availablecash;
	
	float supplycash() {
		return availablecash;
		
	}
	void generatereceipt() {
		System.out.println("Receipt generated for="+supplycash());
	}
	public void setAvailablecash(float availablecash) {
		this.availablecash = availablecash;
	}
}
