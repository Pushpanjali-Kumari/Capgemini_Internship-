package com.capgemini.collectionsexamples;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerList {

	// id validation
	public static int CheckId(int id) {
		String regex = "^.*[0-9]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(String.valueOf(id));
		if (matcher.matches() && id != 0)
			return id;
		else
			return 0;
	}

	// name validation
	public static String CheckName(String name) {
		String regex = "^[a-zA-Z].{3,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches() && name != null)
			return name;
		else
			return null;
	}

	// age validation
	public static int CheckAge(int age) {

		if (age > 0 && age < 100)
			return age;
		else
			return 0;
	}

	// mobile number validation
	public static long CheckMobile(long mobile) {
		String regex = "[0-9]{10}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(String.valueOf(String.valueOf(mobile)));
		if (matcher.matches())
			return mobile;
		else
			return 0L;
	}

	// email validation
	public static String CheckEmail(String email) {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)\\.(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches())
			return email;
		else
			return null;
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> clist = new ArrayList<Customer>();
		// Customer c = new Customer();
		int id, age;
		String dateOfBirth;
		long mobile;
		String email, name;

		char c = ' ';
		while (true) {

			System.out.println("1. create customer list");
			System.out.println("2. update customer list by customer id");
			System.out.println("3. display customer list");
			System.out.println("4. delete customer by customer id ");
			System.out.println("Enter your choice= ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Id- ");
				id = CheckId(sc.nextInt());
				sc.nextLine();

				System.out.println("Enter Name- ");
				name = CheckName(sc.nextLine());

				System.out.println("Enter Age- ");
				age = CheckAge(sc.nextInt());

				System.out.println("Enter Mobile No.- ");
				mobile = CheckMobile(sc.nextLong());
				sc.nextLine();

				System.out.println("Enter DOB- ");
				dateOfBirth = sc.nextLine();

				System.out.println("Enter Email- ");
				email = CheckEmail(sc.nextLine());

				if (id != 0 && name != null && age != 0 && email != null && mobile != 0) {
					clist.add(new Customer(id, name, age, dateOfBirth, email, mobile));
				} else {
					System.out.println("Wrong Input!");
				}
				break;
			case 2:
				System.out.println("Enter id to update- ");
				int uid = sc.nextInt();
				for (int i = 0; i < clist.size(); i++) {
					if (clist.get(i).getCid() == uid) {
						sc.nextLine();
						System.out.println("Name- ");
						name = sc.nextLine();
						String uname = CheckName(name);
						if (uname != null)
							clist.get(i).setCustname(uname);
						else
							System.out.println("Invalid input!");

						System.out.println("Age-");
						age = sc.nextInt();
						int uage = CheckAge(age);
						System.out.println(uage);
						if (uage != 0)
							clist.get(i).setAge(age);
						else
							System.out.println("Invalid input!");

						System.out.println("Mobile No.- ");
						mobile = sc.nextLong();
						long umob = CheckMobile(mobile);
						if (umob != 0)
							clist.get(i).setMobilenumber(mobile);
						else
							System.out.println("Invalid input!");

						sc.nextLine();

						System.out.println("DOB-");
						dateOfBirth=sc.nextLine();
						clist.get(i).setDob(dateOfBirth);

						System.out.println("Email-");
						email = sc.nextLine();
						String uemail = CheckEmail(email);
						if (uemail != null)
							clist.get(i).setEmail(email);
						else
							System.out.println("Invalid input!");
					}
				}
				break;
			case 3:
				Iterator<Customer> citr = clist.iterator();
				while (citr.hasNext()) {
					Customer cs = citr.next();
					System.out.println("ID= " + cs.getCid() + ", NAME= " + cs.getCustname() + ", AGE= " + cs.getAge()
							+ ", DOB= " + (cs.getDob()) + ", Mobile No.= " + cs.getMobilenumber() + ", EMAIL "
							+ cs.getEmail());
				}
				break;
			case 4:
				Iterator<Customer> dcitr = clist.iterator();
				System.out.println("Enter customer id to delete= ");
				int did = sc.nextInt();
				while (dcitr.hasNext()) {
					Customer cs = dcitr.next();
					if (cs.getCid() == did) {
						dcitr.remove();
					}
				}
				break;
			default:
				System.out.println("Wrong choice!!");
			}
			System.out.print("Do you want to continue?(y/n) ");
			sc.nextLine();
			c = sc.next().charAt(0);
			if (c == 'n' || c == 'N') {
				break;
			}
		}
		sc.close();
	}
}
