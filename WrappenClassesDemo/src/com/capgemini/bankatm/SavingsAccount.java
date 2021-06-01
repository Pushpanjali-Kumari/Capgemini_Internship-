package com.capgemini.bankatm;

import java.util.Scanner;

public class SavingsAccount extends Account {
private float interestrate;
	
	void calculateinterest() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter account balance");
		double balance=sc.nextDouble();
		Account accobj=new Account();
		accobj.setBalance(balance);
		double getbalance=accobj.getBalance();
		float rate=sc.nextFloat();
		double interest= getbalance*(rate/100);
		System.out.println("Interest: "+interest);
		
	}
}
