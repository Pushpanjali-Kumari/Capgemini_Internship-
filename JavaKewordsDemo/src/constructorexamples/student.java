package constructorexamples;

public class student {
	//variables or data members or instance variables
	private int stdId;
	private String stdName;
	protected float marks;
	private static String clgName="Techno Group";
// constructor is usually public as it instantiates the class
//default constructor=> without parameters ,no return type, no access specifiers 
	student(){
		this(126,"krishna",87);
		System.out.println("This is a default constructor");

}

// parameterized constructor
	public student(int stdId,String stdName,float marks) {
		super();//object is the super class
		//this();
		System.out.println("parametrised constructor");
		//calls default constructor of the same class
		//note: constructor call should be the first statement
		
		this.stdId=stdId;
		this.stdName=stdName;
		this.marks=marks;
	}
	public void printStudentValues() {
		System.out.println("Student values:");
		System.out.println("Student Id="+stdId);
		System.out.println("Student name="+stdName);
		System.out.println("Student marks="+marks);
		
}
	public void displyResult() {
		if (marks>75)
			System.out.println("Distinction");
		else if(marks>=60 && marks<75)
		    System.out.println("First class");
		else
			System.out.println("Pass");
		}
	
	
	
	}
