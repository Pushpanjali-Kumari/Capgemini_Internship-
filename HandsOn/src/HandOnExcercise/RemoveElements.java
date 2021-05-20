package HandOnExcercise;
import java.util.*;
public class RemoveElements {
	static int[] removeTheElement(int[] arr, int size, int index)
	{
		if (arr == null || index < 0 || index >= size)
			return arr;
		int[] Arr1 = new int[size-1];
		for (int i= 0, k = 0; i < size; i++)
		{
			if (i == index) 
				continue;
			Arr1[k++] = arr[i];
		}
		return Arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array-");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements-");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.print("Enter the index of element to deleted-");
		int indx = sc.nextInt();
		
		arr = removeTheElement(arr, n, indx);
		System.out.println("Resultant array is- " + Arrays.toString(arr));
		
		sc.close();
	}
	}

