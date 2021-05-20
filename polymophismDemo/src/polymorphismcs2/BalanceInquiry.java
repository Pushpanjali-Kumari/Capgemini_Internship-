package polymorphismcs2;
public class BalanceInquiry extends Transaction{
	public BalanceInquiry(){
		super();
	}
		 // BalanceInquiry constructor
		 public BalanceInquiry(int userAccountNumber){
		super(userAccountNumber);
		 }// end BalanceInquiry constructor
		 
		 // performs the transaction
		 public void execute(double balance){
			 super.execute();
			 System.out.println("Balance="+balance);
	 }
 }
	
