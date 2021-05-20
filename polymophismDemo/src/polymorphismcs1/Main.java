package polymorphismcs1;
import java.util.Scanner;
public class Main {
	    public static void admin() {
	        Scanner sc = new Scanner(System.in);
	        Admin a = new Admin();

	        System.out.print("Enter Name-");
	        String name = sc.nextLine();
	        System.out.print("Enter salary-");
	        int sal = sc.nextInt();

	        a.adjustSalary(sal);
	        a.doAdminStuff();
	    }

	    public static void academic() {
	        Scanner sc = new Scanner(System.in);
	        Academic a = new Academic();

	        System.out.print("Enter name-");
	        String name = sc.nextLine();
	        System.out.print("Enter salary-");
	        int sal = sc.nextInt();

	        a.adjustSalary(sal);
	        a.giveLecture();
	    }


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the choice:-1=> Admin 2=>Academic");
	        int ch = sc.nextInt();
	        if (ch == 1)
	            admin();
	        else if (ch == 2)
	            academic();
	        else
	            System.out.println("Invalid choice");
	    }
}

