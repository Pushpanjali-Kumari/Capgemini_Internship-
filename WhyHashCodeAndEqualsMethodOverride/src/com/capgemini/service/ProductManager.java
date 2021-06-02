package com.capgemini.service;

import java.util.ArrayList;
import java.util.Collections;

import com.capgemini.model.Product;
public class ProductManager{

	ArrayList<Product> productList=new ArrayList<Product>();
	public void createProduct() {
		Product p=new Product(1234,"Pen",35);
		Product p1=new Product(1235,"Eraser",25);
		productList.add(p);
		productList.add(p1);
		
	}
	public void compareProduct() {
		if(productList.get(0).equals(productList.get(1))) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		}
	
	public void sortProducts() {
		Collections.sort(productList);
		System.out.println("=====================");
		System.out.println("sorted list");
		System.out.println("=====================");
		for(Product p:productList) {
			System.out.println(p.getPname()+"\t\t\t"+p.getPrice());
		}
		}
		
		
		public void sortProductUsingName() {
			Collections.sort(productList,new ProductNameComparator());
			System.out.println("=====================");
			System.out.println("sorted list using name");
			System.out.println("=====================");
			for(Product p:productList) {
				System.out.println(p.getPname()+"\t\t\t"+p.getPrice());
			}
			}
			
			public void sortProductUsingProductId() {
				Collections.sort(productList,new ProductIdComparator());
				System.out.println("=====================");
				System.out.println("sorted list using id");
				System.out.println("=====================");
				for(Product p:productList) {
					System.out.println(p.getPname()+"\t\t\t"+p.getPrice());
				}
	}
			
			public void sortProductUsingProductPrice() {
				Collections.sort(productList,new ProductIdComparator());
				System.out.println("=====================");
				System.out.println("sorted list using price");
				System.out.println("=====================");
				for(Product p:productList) {
					System.out.println(p.getPname()+"\t\t\t"+p.getPrice());
				}
	}
		
	}
	

