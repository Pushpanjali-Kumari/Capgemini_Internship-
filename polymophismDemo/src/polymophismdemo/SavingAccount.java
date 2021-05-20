package polymophismdemo;
import java.util.Scanner;
public class SavingAccount extends Account{
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	int age; float si;
	public void readAge() {
		System.out.println("Enter the age of account holder:");
		age=sc.nextInt();
	}
	
	public void calculateInterest() {
		System.out.println("interest is calculated here....:");
		if(age<60) {
			si=getAccBalance()*0.5f;
		}
		else
			si=getAccBalance()*0.6f;
		
		System.out.println("Interest calculated:"+si);
			
		}
	
	//overloading the method calculateInterest
	public void calculateInterest(int yrs) {
	System.out.println("interest is calculated here....:");
	if(age<60) {
		si=getAccBalance()*0.5f*yrs;
	}
	else
		si=getAccBalance()*0.6f*yrs;
	
	System.out.println("Interest calculated:"+si);
		
	}
}

	

