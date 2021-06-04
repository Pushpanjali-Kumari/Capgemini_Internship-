package com.capgemini.multithreadingexample;

public class WithoutSynchronization implements Runnable {
	int tickets = 3;
	static int i = 1, j = 2, k = 3;

	public synchronized void bookTicket(String name, int wantedTickets) {
		if (wantedTickets <= tickets) {
			System.out.println("no. of wantedTickets ="+ wantedTickets + " booked to " + name);
			tickets -= wantedTickets;
		} else {
			System.out.println("housefull");
		}
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("t1")) {
			bookTicket(name, i);
		} else if (name.equals("t2")) {
			bookTicket(name, j);
		} else if (name.equals("t3")) {
			bookTicket(name, k);
		}
	}

	public static void main(String... a) {
		WithoutSynchronization wos = new WithoutSynchronization();
		Thread t1 = new Thread(wos);
		Thread t2 = new Thread(wos);
		Thread t3 = new Thread(wos);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();

	}
}
