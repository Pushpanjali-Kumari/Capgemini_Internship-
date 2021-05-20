import java.util.Scanner;
public class CharSymDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the string= ");
				String str=sc.next();
				System.out.print("Enter the index= ");
				int i=sc.nextInt();
				if(str.charAt(i-1)>=97 && str.charAt(i-1)<=122)
					System.out.printf("Index contains an alphabet");
				else if(str.charAt(i-1)>=48 && str.charAt(i-1)<=57)
					System.out.printf("Index contains a digit");
				else
					System.out.printf("Index contains a symbol.");
          sc.close();
		}
}
				
			
