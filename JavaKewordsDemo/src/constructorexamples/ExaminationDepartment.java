package constructorexamples;

public class ExaminationDepartment extends student {
public ExaminationDepartment() {
	super(128,"sri",97);// this calls super class param constructor
	System.out.println("ExaminationDepartment Constructor");
}
public void checkExamFeePayment() {
	System.out.println("Result from check Exam FeePayment method");
	super.marks=56;//accessing super class instance variable using super keyword
	super.displyResult();//accessing super class instance method using super keyword
}
}

             