package com.capgemini.bankatm;

public class DisplayScreen extends BankCustomer{
	public DisplayScreen(String location, String branchname, String customername, String address, String email) {
		super(location, branchname, customername, address, email);
		// TODO Auto-generated constructor stub
	}

	void prompt() {
		System.out.println(BankCustomer.getCustomername()+","+BankCustomer.getAddress()
		+","+BankCustomer.getEmail());
	}
	
	void acceptinput() {
		System.out.println("Input accepted...");
	}
}
