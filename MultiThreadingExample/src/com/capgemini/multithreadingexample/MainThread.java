package com.capgemini.multithreadingexample;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread("thread one");
		new MyThread("thread two");
		new MyThread("thread three");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("main threa interuppted ");
		}
		System.out.println("main thread exiting..");
	}
		
	}


