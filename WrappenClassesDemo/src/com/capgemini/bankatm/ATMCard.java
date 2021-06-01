package com.capgemini.bankatm;

public class ATMCard extends Account {
	private static int pin;
	private static long cardid;
	private Account acc;
	
	public ATMCard(int pin, long cardid, Account acc) {
		super();
		this.pin = pin;
		this.setCardid(cardid);
		this.acc = acc;
	}
	public static int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}

	public Account getAcc() {
		return acc;
	}
	public static long getCardid() {
		return cardid;
	}
	public static void setCardid(long cardid) {
		ATMCard.cardid = cardid;
	}
	
	
}
