import java.util.Scanner;
public class DisariumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER ");
        int num = sc.nextInt();
        int temp = num, d = 0, sum = 0;
        String s = Integer.toString(num);  
        int len = s.length();  
         
        while(temp>0)
        {
            d = temp % 10;  
            sum = sum + (int)Math.pow(d,len);
            len--;
            temp = temp/ 10;
        }
         
        if(sum == num)
            System.out.println("DISARIUM NUMBER");
        else
            System.out.println("NOT DISARIUM NUMBER");
	}

}
