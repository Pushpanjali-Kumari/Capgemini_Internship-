package HandOnExcercise;
import java.util.Scanner;
public class DuplicateValuesInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter length");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements-");
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();     
        System.out.println("Duplicate elements in given array are-");    
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

