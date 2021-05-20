package constructorexamples;

public class MainStudenr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//student s =new student();//default constructor
		//student s1 =new student(1,"rama",85);// parameterized constructor
		//s1.printStudentValues();
		ExaminationDepartment ed= new ExaminationDepartment();
		ed.printStudentValues();
		ed.checkExamFeePayment();
	}

}
