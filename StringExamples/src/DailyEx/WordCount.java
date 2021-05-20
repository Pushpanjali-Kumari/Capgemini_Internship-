import java.util.Scanner;
public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the string=");
				String str=sc.next();
				int n=str.length();
				int word=0;
				for(int i=0;i<n;i++)
				{
					if(str.charAt(i)==' ');
					word++;
				}

		System.out.println("Number of words="+ (word-1));
			}

			}
	