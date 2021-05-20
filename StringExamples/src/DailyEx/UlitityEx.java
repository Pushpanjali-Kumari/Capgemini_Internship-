import java.util.Scanner;

public class UlitityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the no.");
int num=sc.nextInt();
System.out.println("cube root="+Math.cbrt(num));
System.out.println("square root="+Math.sqrt(num));
System.out.println("pi value="+Math.PI);
System.out.println("absolute value"+Math.abs(num));
System.out.println("enter float number");
float num1=sc.nextFloat();
System.out.println("floor value="+Math.floor(num1));
System.out.println("ceil value="+Math.ceil(num1));
System.out.println("sin value="+Math.sin(90));
System.out.println("cos value="+Math.cos(0));
System.out.println(Math.random());
	}

}
