package arithmeticoperations;

import java.util.Scanner;

public class InchesMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Input n in inches ");
        int n;
		n=sc.nextInt();
		double c=n*0.0254;
		System.out.print(c);
		sc.close();
    }
	}
