package com.capgemini.bankatm;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the location=");
		String location=sc.nextLine();
		System.out.println("Enter the branchname=");
		String branchname=sc.nextLine();
		ATM atmobj=new ATM(location,branchname);
		atmobj.show();
		System.out.println("Enter date in dd/MM/yyyy =");
		String sdate=sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date=(Date) sdf.parse(sdate);
		System.out.println("Enter the amount =");
		double amount=sc.nextDouble();
		Transaction trobj=new Transaction(date, amount);
		trobj.starttransaction();
		System.out.println("Enter the balance =");
		double balance=sc.nextDouble();
		double rembalance=trobj.calculatebalance(balance);
		System.out.println("Account balance= "+trobj.getaccountbalance(rembalance));
		trobj.canceltransaction(rembalance);
		Account accobj=new Account();
		accobj.calculateinterest();
		accobj.updateaccount();
		accobj.verifywithdrawamount();
		System.out.println("Enter pin=");
		int pin=sc.nextInt();
		System.out.println("Enter card id=");
		long cardid=sc.nextLong();
		ATMCard atmcobj=new ATMCard(pin, cardid, accobj);
		CurrentAccount curraccobj=new CurrentAccount();
		curraccobj.calculateinterest();
		SavingsAccount savaccobj=new SavingsAccount();
		savaccobj.calculateinterest();
		System.out.println("Enter customer name=");
		String name=sc.nextLine();
		System.out.println("Enter address=");
		String address=sc.nextLine();
		System.out.println("Enter email");
		String email=sc.nextLine();
		BankCustomer bcobj=new BankCustomer(location, branchname, name, address, email);
		bcobj.insertcard();
		bcobj.startransaction();
		bcobj.enterpin(pin);
		bcobj.changepin();
		bcobj.withdrawcash();
		bcobj.requesttransactionsummary();
		bcobj.acceptamount();
		DisplayScreen dsobj=new DisplayScreen(location, branchname, name, address, email);
		CardDispenser cdsobj=new CardDispenser(location, branchname);
		System.out.println("Enter available cash=");
		float availablecash=sc.nextFloat();
		cdsobj.supplycash();
		cdsobj.generatereceipt();
		
	}

	}


