package com.capgemini;
import com.capgemini.service.ProductManager;
public class ProductMain {
	public static void main(String[] args) {
	
	ProductManager pm=new ProductManager();
	pm.createProduct();
	pm.compareProduct();
	pm.sortProducts();
	pm.sortProductUsingName();
	pm.sortProductUsingProductId();
	pm.sortProductUsingProductPrice();
	}
	/*ArrayList<String> names=new ArrayList<String>();
	names.add("rama11");
	names.add("krishna");
	*/
	
}
