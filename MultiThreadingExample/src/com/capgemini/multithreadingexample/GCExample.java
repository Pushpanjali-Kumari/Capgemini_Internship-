package com.capgemini.multithreadingexample;

public class GCExample {
	public void finalize() {
	System.out.println("finalize method is called to make obj deleted by gc");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Demo d= new Demo();
	d=null;
	System.gc();
	}

}
