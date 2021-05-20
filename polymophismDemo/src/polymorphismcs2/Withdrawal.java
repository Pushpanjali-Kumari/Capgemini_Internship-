package polymorphismcs2;
public  class Withdrawal extends Transaction {
	double amount; // amount to withdraw
    
    public Withdrawal(){
   	 super();
   	
    }
    
    public Withdrawal(int userAccountNum,double amount){
    	super(userAccountNum);
		this.amount=amount;
    }
    
	     public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


	     public void execute(double balance){
	    	 super.execute();
	    	 balance=balance-amount;
	    	 System.out.println("Balnce="+balance);
	    } // end method execute
} 

