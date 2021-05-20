import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i,sum=0;
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
				}
		}
		if(sum==num)
			System.out.println("PERFECT");
		else
			System.out.println("NOT PERFECT");
	}

}
	


