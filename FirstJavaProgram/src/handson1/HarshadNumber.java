import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number ");
		int num = sc.nextInt();
		int x = num, y, sum = 0;

		while(x>0)
		{
			y = x%10;
			sum = sum + y;
			x = x/10;
		}

		if(num%sum == 0)
			System.out.println(num+" HARSHAD NUMBER");
		else
			System.out.println(num+" NOT HARSHAD NUMBER");      
	}
}

