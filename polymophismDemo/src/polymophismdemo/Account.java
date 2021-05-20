package polymophismdemo;

import java.util.Scanner;

public class Account {
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accId, String accHolderName, float accBalance, Scanner sc) {
		super();
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
		this.sc = sc;
	}
	
	private int accId;
	private String accHolderName;
	private float accBalance;
	Scanner sc=new Scanner(System.in);
public void openAccount() {
		System.out.println("Enter account details:");
		System.out.println("Enter account ID:");
		accId=sc.nextInt();
		System.out.println("Enter account holder name:");
		//sc.nextLine():
		accHolderName=sc.nextLine();
		System.out.println("Enter deposit amount:");
		accBalance=sc.nextFloat();
}
public void viewAccount() {
		System.out.println("Enter account details:");
		System.out.println("Enter account ID:"+accId);
		System.out.println("Enter account holder name:"+accHolderName);
		System.out.println("Enter deposit amount:"+accBalance);
}

public void calculateInterest() {
		System.out.println("interest is calculated here....:");
		float si;
		int age = 0;
		if(age<60) {
			si=getAccBalance()*0.5f;
		}
		else
			si=getAccBalance()*0.6f;
}


public int getAccId() {
	return accId;
}
public void setAccId(int accId) {
	this.accId = accId;
}
public String getAccHolderName() {
	return accHolderName;
}
public void setAccHolderName(String accHolderName) {
	this.accHolderName = accHolderName;
}
public float getAccBalance() {
	return accBalance;
}
public void setAccBalance(float accBalance) {
	this.accBalance = accBalance;
}
public Scanner getSc() {
	return sc;
}
public void setSc(Scanner sc) {
	this.sc = sc;
}

}
