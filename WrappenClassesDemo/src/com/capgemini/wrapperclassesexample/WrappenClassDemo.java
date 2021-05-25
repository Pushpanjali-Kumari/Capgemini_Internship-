package com.capgemini.wrapperclassesexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WrappenClassDemo {
 public static void main(String args[]) {
	 int a=30;
	 //boxing
	 Integer I=a;
	 //unboxing
	 System.out.println(Integer.valueOf(I));
	 
	 Float f=360154f;
	 System.out.println(Float.valueOf(f));
	 
	  Character ch='A';
	  System.out.println(Character.valueOf(ch));
	  System.out.println((int)ch.charValue());// type casting
	  
	  String s;
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));;
	   try {
		   System.out.println("enter the value-");
		s=br.readLine();
		int value=Integer.parseInt(s);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   Scanner sc =new Scanner(System.in);
	   System.out.println("enter the value");
	   int r=sc.nextInt();
	   
	  
	   
 }
}
