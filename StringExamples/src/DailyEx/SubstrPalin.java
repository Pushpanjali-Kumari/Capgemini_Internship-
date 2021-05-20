import java.util.*;
public class SubstrPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        System.out.print("Enter the string= ");
				Scanner sc=new Scanner(System.in);
				String str=sc.next();
				System.out.print("Enter the index = ");
				int index=sc.nextInt();
				String substr=str.substring(index-1);
				String rev="";
				for(int i=substr.length()-1;i>=0;i--) {
					rev=rev+substr.charAt(i);
				}
				
				if(substr.equals(rev))
					System.out.println("The substring is palindrome");
				else
					System.out.println("The substring is not palindrome");
				
				sc.close();
			}
}
