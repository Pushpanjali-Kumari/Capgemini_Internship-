package com.capgemini.checkexceptionexample;

import java.util.Scanner;

public class UserDefinedMobileException  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile number=");
		int mb=sc.nextInt();
		try {
			if(mb<10 || mb>10) {
				throw new MobileNotValid("Invalid mobile number! Enter Again...");	
			}
		}catch(MobileNotValid b) {
			System.out.println(b.getMessage());
		}
	}
}
