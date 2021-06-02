package com.capgemini.model;

public class Product implements Comparable<Product> {

	private int pid;
	private String pname;
	private float price;
	
	//default constructor
	public Product() {
		super();
	}
	//parameterized constructor
	public Product(int pid, String pname, float d) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = d;
	}
	//	getters and setters
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public int compareTo(Product product) {
		// TODO Auto-generated method stub
		return pname.compareTo(product.pname);
	}
	
}
