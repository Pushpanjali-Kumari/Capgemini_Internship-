package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
		double salary=sc.nextDouble();
		try {
			if(salary<0)
				throw new SalaryNotValid("Invalid salary!! salary cannot be negative..");
		}catch(SalaryNotValid an) {
			System.out.println(an.getMessage());
		}
}
}
