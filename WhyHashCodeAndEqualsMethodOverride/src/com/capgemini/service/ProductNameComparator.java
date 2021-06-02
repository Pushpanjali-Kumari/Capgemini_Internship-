package com.capgemini.service;

import java.util.Comparator;

import com.capgemini.model.Product;

public class ProductNameComparator implements Comparator<Product>{

	@Override
	public int compare(Product product1, Product product2) {
		// TODO Auto-generated method stub
	
		return product1.getPname().compareTo(product2.getPname());
}
}
