package com.capgemini.checkexceptionexample;

public class AgeNotValid extends Exception {
	String message;
	AgeNotValid(String msg){
		super(msg);
		message=msg;
	}

}
