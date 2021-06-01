package com.capgemini.collectionsexamples;

public class Results extends Student{
 String result;
 
 public void announceResults() {
	 float marks=getMarks();
	 
	 if(marks>80) {
		 System.out.println("Distinction");
	 }else if((marks>60)&&(marks<=80)) {
		 System.out.println("First class");
	 }else {
		 System.out.println("pass");
	 }
	 }
 }
}
