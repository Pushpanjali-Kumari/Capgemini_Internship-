package HandOnExcercise;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter length of array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        for(int i=0;i<n/2;i++){
            arr[i] = arr[i]+arr[n-i-1];
            arr[n-i-1] = arr[i]-arr[n-i-1];
            arr[i] = arr[i] - arr[n-i-1];
        }
        System.out.println("Array in Reverse Form");
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
	}

}
