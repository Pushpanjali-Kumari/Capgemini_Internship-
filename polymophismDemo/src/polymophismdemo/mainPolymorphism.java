package polymophismdemo;

public class mainPolymorphism {

	public static void main(String[] args) {
		//account 1
		SavingAccount sa= new SavingAccount();
		sa.openAccount();
		sa.calculateInterest();
		sa.viewAccount();
		sa.calculateInterest();
		//account 2
		SavingAccount sa1= new SavingAccount();
		sa1.openAccount();
		sa1.calculateInterest();
		sa1.viewAccount();
		
		Account ac= new Account();
		ac.calculateInterest();// this calls super class calculte_Interst method
			
	}
}
