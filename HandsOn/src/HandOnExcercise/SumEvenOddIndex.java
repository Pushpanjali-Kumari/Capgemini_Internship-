package HandOnExcercise;
import java.util.*;
public class SumEvenOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=sc.nextInt();
		int sum1=0,sum2=0;
		System.out.println("Enter the array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				sum1=sum1+a[i];
			}
			else
				sum2=sum2+a[i];
		}
		System.out.println("Even index sum = "+sum1);
		System.out.println("Odd index sum ="+sum2);
	}
	}

