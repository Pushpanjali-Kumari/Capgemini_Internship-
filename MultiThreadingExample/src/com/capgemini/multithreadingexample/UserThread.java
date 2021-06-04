package com.capgemini.multithreadingexample;
/**
 * 
 * @author Pushpanjali
 *
 */
public class UserThread extends Thread{
	//to assign an action/task to a thread
	public void run() {
		System.out.println("Thread is in running state");
		for(int i=1;i<10;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		UserThread ut=new UserThread();
			ut.start();//thread1
			/*
			 * Thread.sleep(3000); System.out.println("sleep is done");//prints after some
			 * time
			 */	
			
			UserThread ut1=new UserThread();
			ut1.start();//thread2
			System.out.println("sleep is done");
			ut.run();//this is not thread
			}
}
