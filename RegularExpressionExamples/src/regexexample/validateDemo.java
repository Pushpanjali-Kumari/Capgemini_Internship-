package regexexample;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the username");
		String username=sc.next();
		System.out.println(Pattern.matches("^[A-Za-z]{8,}[@$!%*#?&]{1,}$", username));

		String email="^[a-zA-Z0-9+_.-]+@(.+)\\.(.+)$";
		System.out.println("Enter the email");
	    String email1=sc.next();
		Pattern pattern=Pattern.compile(email);
		Matcher matcher =pattern.matcher(email1);
		//System.out.println(Pattern.matches("[a-zA-z0-9]{8,16}",m));
		boolean rer=matcher.matches();
		System.out.println(rer);
	    
		System.out.println("Enter the password");
		String password=sc.next();
		System.out.println(Pattern.matches("^[A-Za-z]{8,}[@$!%*#?&]{1,}$", password));

		System.out.println("Enter the mobile no.");
		String mobileno=sc.next();
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}",mobileno ));

		System.out.println("Enter the city");
		String city=sc.next();
		System.out.println(Pattern.matches("^[a-zA-Z]{1,}", city));
		
		System.out.println("Enter the pin code");
		String pin=sc.next();
		System.out.println(Pattern.matches("^[0-9]{1,6}$", pin));
		


		sc.close();
		}
	}

