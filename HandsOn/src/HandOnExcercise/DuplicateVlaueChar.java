package HandOnExcercise;

import java.util.Scanner;

public class DuplicateVlaueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter length-");
        int n = sc.nextInt();
        char arr[]=new char[n];
        System.out.println("Enter the elements-");
        for(int i=0;i<n;i++)
        	arr[i]=sc.next().charAt(0);     
        System.out.println("Duplicate characters in given array are- ");    
        for(int i = 0; i < arr.length; i++) 
        {  
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }
	}
        sc.close();
	}
}
