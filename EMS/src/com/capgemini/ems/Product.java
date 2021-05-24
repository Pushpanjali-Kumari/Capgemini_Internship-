package com.capgemini.ems;

import java.util.Scanner;

public class Product {
	private int pid;
	private int price;
	private String pname;

	public Product() {
		super();
	}

	public Product(int pid, int price, String pname) {
		super();
		this.pid = pid;
		this.price = price;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	// creating the list of Product using array and returning an array
	Scanner sc = new Scanner(System.in);

	public Product[] createPoductList() {
		Product[] productList1 = new Product[3];
		for (int i = 0; i < productList1.length; i++) {
			System.out.println("Enter the product details for  " + i + " product object");
			productList1[i] = new Product();
			productList1[i].setPid(sc.nextInt());
			productList1[i].setPname(sc.next());
			productList1[i].setPrice(sc.nextInt());
		}
		return productList1;
	}

	// find a product by id and update
	public void updateProductById(Product[] p, int id) {
		for (int i = 0; i < p.length; i++) {
			if (p[i].getPid() == id) {
				System.out.println("Product found at " + i);
				System.out.println("Enter new name to update for the Product");
				String updatedname = sc.next();
				p[i].setPname(updatedname);
				System.out.println("Enter new price to update for the Product");
				int updatedprice = sc.nextInt();
				p[i].setPid(updatedprice);
				System.out.println("Product Id = " + p[i].getPid() + "\nProduct name = " + p[i].getPname()
						+ "\nproduct price=" + p[i].getPrice());
				break;
			} else {
				System.out.println("No product found");
			}
		}
		System.out.println();
	}

	// delete an product by id
	public Product[] deleteProductById(Product[] p, int id) {
		int originalLength = p.length;
		boolean found=false;
		for (int i = 0; i < originalLength; i++) {
			if (p[i].getPid() == id) {
				System.out.println(" Product found at = " + i);
				p[i]=null;
				System.out.println("product deleted!!");
				found=true;
				//p[i] = p[originalLength - 1];
				//originalLength--;
				break;
			} 
		}
		if(!found)
				System.out.println("No  Product found");
		System.out.println();
		return p;
	}

	// displayProductDetails with product Object as argument
	public void displayProdList(Product[] p) {
		// TODO Auto-generated method stub

		for (int i = 0; i < p.length; i++) {
			if (p[i] != null)
				System.out.println("Product id = " + p[i].getPid() + "\nproduct  name = " + p[i].getPname()
						+ "\nproduct price=" + p[i].getPrice());
			System.out.println();
		}
	}

	// display product details by id
	public void displayProductById(Product[] p, int id) {
		for (int i = 0; i < p.length; i++) {
			if (p[i].getPid() == id) {
				System.out.println("product found at " + i);
				System.out.println("product Id = " + p[i].getPid() + "\nproduct name = " + p[i].getPname()
						+ "\nproduct price=" + p[i].getPrice());
				break;
			} else {
				System.out.println("No product found");
			}
		}
		System.out.println();
	}

}
