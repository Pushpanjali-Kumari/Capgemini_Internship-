package com.capgemini.anonymousclassexample;

public class RunnableInterfaceUsingAnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Implementation of runnable functional interface using anonymous class");
				System.out.println("Runnable method in anonymous class");
			}
	}).start();

}
}
