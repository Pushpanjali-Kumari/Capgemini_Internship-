package com.capgemini.anonymousclassexample;

public class RunnableIntefaceUsingLambaExpressions {
	public static void main(String[] args) {
		// implementing runnable interface using lambda expression
		Runnable runnable1 = () -> {
			System.out.println("run method using lambda expression");
			System.out.println("Runnable method in anonymous class");
		};
		Thread th = new Thread(runnable1);
		th.start();

		//implementing using anonymous class
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
