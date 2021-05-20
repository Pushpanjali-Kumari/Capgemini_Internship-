package regexexample;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Burn your ego before it burns you";

Pattern p=Pattern.compile(".you",Pattern.CASE_INSENSITIVE); //. represnts single character
Matcher m=p.matcher(str);
boolean result=m.find();
System.out.println(result);
if(result) {
	System.out.println("Pattern Matched");
}
	else
		System.out.println("Pattern not Matched");
}

	}


