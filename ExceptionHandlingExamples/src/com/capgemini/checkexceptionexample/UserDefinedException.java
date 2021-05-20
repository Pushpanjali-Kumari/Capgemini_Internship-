package com.capgemini.checkexceptionexample;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		try {
			if(age<18)
				throw new AgeNotValid("age is below range");
				else if(age>80)
					throw new AgeNotValid("age is out of range");
		}catch(AgeNotValid an) {
			System.out.println(an.getMessage());
		}
	}

}
