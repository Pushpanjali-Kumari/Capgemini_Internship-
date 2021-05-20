import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
		int i,sum=0,d,fact,temp=num;
		while(num!=0)
		{
			i=1;
			fact=1;
			d=num%10;
			while(i<=d)
			{
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			num=num/10;
		}
if(sum==temp)
	System.out.println("STRONG NUMBER");
else
	System.out.println("NOT STRONG NUMBER");
	}

}
