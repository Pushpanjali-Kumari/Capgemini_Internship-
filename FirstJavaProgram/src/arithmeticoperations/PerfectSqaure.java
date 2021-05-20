package arithmeticoperations;

import java.util.Scanner;

public class PerfectSqaure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int d= (int)(Math.sqrt(n));
		if((d*d)==n)
			System.out.println("Perfect Square");
		else
			System.out.println("Not Perfect Square");
		sc.close();
	}
	}

