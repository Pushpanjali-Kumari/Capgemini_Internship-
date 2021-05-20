import java.util.Scanner;
public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the string= ");
				String str = sc.next();
				System.out.println("The duplicate characters are= ");
				for(int i=0;i<str.length();i++)
				{
					for(int j=i+1;j<str.length();j++)
					{
						if(str.charAt(i)==str.charAt(j)) {
							System.out.print(str.charAt(j));
							break;
		}
	}
}
				
sc.close();
}
}

		
