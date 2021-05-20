package com.capgemini.checkexceptionexample;

public class MobileNotValid extends Exception {
		String message;
		MobileNotValid(String msg){
			super(msg);
			message=msg;
		}

	}

