package com.capgemini.bankatm;

public class ATM {
	private String location;
	private String branchname;
	
	
	public String getLocation() {
		return location;
	}


	public String getBranchname() {
		return branchname;
	}


	public ATM(String location, String branchname) {
		super();
		this.location = location;
		this.branchname = branchname;
	}


	public void show() {
		System.out.println("Location= "+this.location+","+"Branch name= "+this.branchname);
	}
	
}