package polymorphismcs2;
public class Deposit extends Transaction{
	 double amount;
	public Deposit() {
		super();
	}
    public Deposit(int userAccountNum,double amount) {
		super(userAccountNum);
		this.amount=amount;
	}
    
    public void setAmount(double amount) {
		this.amount = amount;
    }
	public void execute(double balance) {
		// TODO Auto-generated method stub
		super.execute();
		balance=balance+amount;
		
		System.out.println("Balance= "+balance);
	}
}
