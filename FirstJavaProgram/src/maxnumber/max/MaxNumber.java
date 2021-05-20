package maxnumber.max;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Number");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b)
        {
            max = a;
        }
        else
        {
            max= b;
        }
		
        System.out.print("Greatest of Two Number is " +max);
        sc.close();
    }
	}

