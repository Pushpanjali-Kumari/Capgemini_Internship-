package com.capgemini.AbstractClassEx;

public class SavingAccount extends BankAccount {

	/*
	 * //static {//initializer block super.minBal= 3000; }
	 */

	float rateOfInterest = 0.3f;
	int withdrawAmt;
	int deptAmt;

	public SavingAccount() {
		super();// default constructor of the super class is called
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		super.enterDetailsToOpenAccount();
		super.minBal = 3000;
		System.out.println("Enter accId");
		accId = details.nextInt();
		System.out.println("Enter account holder name");
		details.nextLine();
		accHolderName = details.nextLine();
		System.out.println("Enter actual balnce");
		actualBal = details.nextInt();
		System.out.println("Enter address");
		details.nextLine();
		address = details.nextLine();
		super.accType = "savings";

	}

	@Override
	public float calculateInterest() {
		// TODO Auto-generated method stub
		return actualBal * rateOfInterest;

	}

	@Override
	public void creditAmount() {
		System.out.println("ammount credited=" + (actualBal + calculateInterest()));
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("enter amt to withdraw");
		withdrawAmt = details.nextInt();
		System.out.println("after withdraw balance" + (updateAmount()));
		System.out.println("thanks!");
	}

	private float updateAmount() {
		// TODO Auto-generated method stub
		return (actualBal - withdrawAmt);
	}

	public void addMoney() {
		// TODO Auto-generated method stub
		System.out.println("enter amt to deposit");
		deptAmt = details.nextInt();
		actualBal += deptAmt;
		System.out.println("after with deposit balance=" + (actualBal));
		System.out.println("thank you");
	}

	@Override
	public void creditInterest() {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub

	}

}
