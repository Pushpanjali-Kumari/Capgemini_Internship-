package polymorphismcs2;

public abstract class Transaction {

	    // attributes
	    private int accountNumber;
	     // no-argument constructor invoked by subclasses using super()
	     public Transaction(){ 
	    	 super();
	     } // end no-argument Transaction constructor
	     public Transaction(int accountNumber ){ 
	    	 super();
	    	 this.accountNumber=accountNumber;
	     } 
	     public int getAccountNumber() {
	    	 return accountNumber;
	     }
	     
	    public void setAccountNumber(int accountNumber)
	     {
	    	this.accountNumber=accountNumber;
	     } 
	

	    public void execute() {
	    	System.out.println("Account NO.="+accountNumber);
	    }
	   
	 } // end class Transaction

