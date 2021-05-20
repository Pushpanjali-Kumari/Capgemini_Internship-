import java.util.Scanner;
public class ReverseString {
	public static String Reverse(String s) {
    String rev="";
	for(int i=s.length()-1;i>=0;i--)
	rev+=s.charAt(i);
	return rev;
	}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
					Scanner sc=new Scanner(System.in);
					System.out.print("Enter the String= ");
					String str = sc.nextLine(); 
					System.out.println("Reverse String is="+Reverse(str));
					sc.close();
				}
		}
	
