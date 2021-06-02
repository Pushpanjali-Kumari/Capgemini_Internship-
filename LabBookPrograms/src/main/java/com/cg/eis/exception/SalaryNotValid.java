package com.cg.eis.exception;

public class SalaryNotValid extends Exception {
	String message;
	SalaryNotValid(String msg){
		super(msg);
		message=msg;
}
}
