import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int [10];
		while(num!=0)
		{
			int d=num%10;
			arr[d]++;
			num/=10;
		}

		for(int i=0;i<10;i++)
		{
			if(arr[i]>1)
			{
				System.out.println("Digit "+i+" is repeated "+arr[i]+" times.");
			}
	}
	}
}
