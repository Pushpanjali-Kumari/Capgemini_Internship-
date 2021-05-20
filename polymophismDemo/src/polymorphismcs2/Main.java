package polymorphismcs2;

import java.util.Scanner;
public class Main {

	private static void Deposit(int AccNum,double balance) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount to deposit-");
        double amount = sc.nextDouble();
        Deposit d = new Deposit(AccNum,amount);
        
        d.execute(balance);
        sc.close();
	}

	private static void Withdrawal(int AccNum,double balance) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount to Withdraw-");
        double amount = sc.nextDouble();
        Withdrawal d = new Withdrawal(AccNum,amount);
        
        d.execute(balance);
        sc.close();
		
	}

	private static void BalanceInquiry(int AccNum,double balance) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BalanceInquiry be=new BalanceInquiry(AccNum);
		
		be.execute(balance);
		
		sc.close();
	}
	
	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number= ");
		int AccNum=sc.nextInt();
		System.out.print("Enter the initial amount= ");
		double balance=sc.nextDouble();

        System.out.println("Enter the choice:-1=> Balance Inquiry 2=>Withdrawal 3=>Deposit");
        int ch = sc.nextInt();
        if (ch == 1)
        	BalanceInquiry(AccNum, balance);
        else if (ch == 2)
        	Withdrawal(AccNum, balance);
        else if(ch ==3 )
        	Deposit(AccNum, balance);
        else
            System.out.println("Invalid choice");
        sc.close();
    }

	
}
