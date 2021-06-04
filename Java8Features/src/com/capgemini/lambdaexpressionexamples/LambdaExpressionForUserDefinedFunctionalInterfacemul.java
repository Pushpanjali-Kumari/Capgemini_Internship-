package com.capgemini.lambdaexpressionexamples;

import java.util.function.Predicate;

/**
 * 
 * @author Pushpanjali
 *
 */
public class LambdaExpressionForUserDefinedFunctionalInterfacemul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lambda without return type and two parameters
		Multiplication mul = (int a, int b) -> {
			System.out.println("Multiplication of two nos=" + (a * b));
		};
		mul.mul(5, 6);

		// Lambda expression for predicate interface in java.util.function package
		Predicate<Integer> greater = age -> (age > 18);

		// calling predicate method
		System.out.println(greater.test(20));
		Predicate<Integer> lesser = age -> (age > 18);
		System.out.println(lesser.test(20));

		boolean checkAge = lesser.negate().test(25);
		System.out.println(checkAge);
		
		//calling a method with predicate as parameter
		predicateInMethod(14, age -> (age > 18));
	}

	// predicate in to method param
	static void predicateInMethod(int number, Predicate<Integer> age) {
		if (age.test(number)) {
			System.out.println("age=" + number);
		} else {
			System.out.println("age not satisfied=" + number);
		}
	}
}
