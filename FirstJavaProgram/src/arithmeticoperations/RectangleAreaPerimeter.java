package arithmeticoperations;

import java.util.Scanner;

public class RectangleAreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        int l, b, peri, area;
	        System.out.print("Enter length of rectangle");
	        l = sc.nextInt();
	        System.out.print("Enter breadth of rectangle");
	        b = sc.nextInt();
	        peri = 2 * (l + b);
	        System.out.println("Perimeter is="+peri);
	        area = l * b;
	        System.out.println("Area is="+area);
	        sc.close();
	}

}
