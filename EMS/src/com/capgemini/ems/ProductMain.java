package com.capgemini.ems;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		char c = ' ';
		Product p = new Product();
		Product[] productList1 = new Product[3];
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1. Create the product list");
			System.out.println("2. update the product list");
			System.out.println("3. delete a product by product Id");
			System.out.println("4. display all the product details in the product list");
			System.out.println("5. display a product by product id");
			System.out.print("Enter your choice-");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				productList1 = p.createPoductList();
				break;
			case 2:
				System.out.println("Enter the product id to update an product details=");
				int pid = sc.nextInt();
				p.updateProductById(productList1, pid);
				break;
			case 3:
				System.out.println("Enter the product id to delete product details=");
				int did = sc.nextInt();
				p.deleteProductById(productList1, did);
				break;
			case 4:
				System.out.println("Product Details of  the product list is:\n ");
				p.displayProdList(productList1);
				break;
			case 5:
				System.out.println("Enter the product id to display  product details=");
				int disid = sc.nextInt();
				p.displayProductById(productList1, disid);
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
		sc.close();
	}
}
