package regexexample;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class RegExDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//. represents single character
		/*
		 * System.out.println(Pattern.matches("..s","mas"));// in exactly 3 characters
		 * the 3rd char is s then true else false String s="This is a string"; String
		 * s1="D"; System.out.println(Pattern.matches("[^abc]",s1));
		 * System.out.println(Pattern.matches("[abc]",s1));
		 * System.out.println(s.length()); //[abc] it looks for a or b or c //[^abc] it
		 * looks for other char except a or b or c
		 * System.out.println(Pattern.matches("[A-Z]",s1));
		 * System.out.println(Pattern.matches("[a-zA-Z]{13}",s));
		 */
		    Scanner sc=new Scanner(System.in);
			/*
			 * System.out.println("Enter the mobile no"); String mobNo=sc.next(); boolean
			 * result=Pattern.matches("[789]{1}{0-9}{9}", mobNo); //no should start with
			 * 7/8/9 atleast 1 of them should match remaining char can be b/w 0-9 //using
			 * char classes and quantifiers System.out.println("result="+ result); boolean
			 * result1=Pattern.matches("[789]{1}\\d{9}", mobNo);//using metacharacters
			 * System.out.println("result using maetacharacters="+ result1);
			 * 
			 * 
			 * 
			 * System.out.println("Enter the email"); String email=sc.next();
			 */
		    String regexEamil="^(.+)@(.+)#$"; 
		    //.+==> atleast one or more Character
		    //^==> start of the line(called as caret)
		    //$==> end of the line
			/*
			 * Pattern pattern= Pattern.compile(regexEamil); Matcher matcher=
			 * pattern.matcher(email); boolean result2=matcher.matches();
			 * System.out.println(result2);
			 * 
			 * 
			 * System.out.println("Enter the mobile no"); String pwd=sc.next();
			 * System.out.println(Pattern.matches("[a-zA-Z0-9] {8, 16}",pwd));
			 */
		    //adding more restrictions on email
		    String regexEamil2= "^[a-zA-Z0-9._$+]{4-10}@[a-z]{2,6}\\.(.+)$";
		    System.out.println("Enter the email");
		    String email2=sc.next();
		    Pattern pattern1= Pattern.compile(regexEamil2);
		    Matcher matcher1= pattern1.matcher(email2);
		    boolean result3=matcher1.matches();
		    System.out.println(result3);
		    
	}
	
	

}
