package com.capgemini.collectionsexamples;

import java.util.Date;

public class Customer {
	private int cid;
	private String custname;
	private int age;
	private Date dob;
	private String email;
	private long mobilenumber;
	
	public Customer() {
		super();
	}
	public Customer(int cid, String custname, int age, Date dob, String email, long mobilenumber) {
		super();
		this.cid = cid;
		this.custname = custname;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.mobilenumber = mobilenumber;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
}
