package arithmeticoperations;

import java.util.Scanner;

public class CircleAreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	      Scanner sc= new Scanner(System.in);  
	      double PI=3.14;
	      System.out.println("Enter the radius of circle-");
	      int r= sc.nextInt();
	      double  area=PI*r*r ;
	      System.out.println("Area=" + area);
	      double peri= PI*2*r;
	      System.out.println( "Perimeter="+peri) ;
	      sc.close();
	   }
	}
