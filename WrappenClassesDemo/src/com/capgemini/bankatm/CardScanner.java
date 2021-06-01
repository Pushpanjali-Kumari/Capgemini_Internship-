package com.capgemini.bankatm;

public class CardScanner extends ATMCard {
	
	public CardScanner(int pin, long cardid, Account acc) {
		super(pin, cardid, acc);
	}

	public boolean acceptcard(int cardid) {
		if (cardid!=0)
			return true;
		else
			return false;
	}
	
	void readcard() {
		System.out.println(ATMCard.getCardid());
	}
	
	void ejectcard() {
		ATMCard.setCardid(0);
	}
	
	void validatepin() {
		int pin=ATMCard.getPin();
		String pinlen= String.valueOf(pin);
		if(pinlen.length()==4)
			System.out.println("Valid pin!!");
		else
			System.out.println("Invalid pin!!");
	}
}
