package com.capgemini.service;

import java.util.Comparator;

import com.capgemini.model.Product;

public class ProductIdComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) { 
	// TODO Auto-generated method stub
		if(product1.getPid()==product2.getPid()) 
    return 0;
		else if(product1.getPid()>product2.getPid()) 
			return 1;
		else 
			return -1;
	
	
}
}
