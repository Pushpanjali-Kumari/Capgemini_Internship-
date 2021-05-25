package com.capgemini.collectionsexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetFlower {

	public static void main(String args[]) {

		int choice;
		char c = ' ';
		// adding Student objects in to hash set

		Scanner sc = new Scanner(System.in);
		HashSet<Flower> flowerList = new HashSet<Flower>();
		Flower fl;

		while (true) {

			System.out.println("1. Create the flower list");
			System.out.println("2. Display all the flower details in the flower list");
			System.out.println("3. Remove flower based on quantity");
			System.out.print("Enter your choice-");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				for (int i = 0; i < 3; i++) {
					System.out.println("Enter the details of flower");
					System.out.println("Enter the flower id=");
					int id = sc.nextInt();
					System.out.println("Enter the flower Name=");
					String name = sc.next();
					System.out.println("Enter the flower price per kg=");
					int ppkg = sc.nextInt();
					System.out.println("Enter the flower quantity=");
					int qty = sc.nextInt();
					flowerList.add(new Flower(id, name, ppkg, qty));
				}
				break;
			case 2:
				Iterator<Flower> flItr = flowerList.iterator();
				System.out.println("Student HashSet values using Iterator");
				while (flItr.hasNext()) {
					Flower st = flItr.next();
					System.out.println(st.getFname() + " \t\t\t " + st.getFid() + "\t\t\t " + st.getPricePerKg()
							+ "\t\t\t " + st.getQty());
					System.out.println();
				}
				break;

			case 3:
				Iterator<Flower> flItr1 = flowerList.iterator();
				while (flItr1.hasNext()) {
					Flower st = flItr1.next();
					if (st.getQty() <= 0) {
						flItr1.remove();
						System.out.println("flower has been removed!!");
					}
				}
				break;

			default:
				System.out.println("Enter Again..");
			}

			System.out.print("Do you want to continue?(y/n) ");
			sc.nextLine();
			c = sc.next().charAt(0);
			if (c == 'n' || c == 'N') {
				break;
			}
		}
	}
}
