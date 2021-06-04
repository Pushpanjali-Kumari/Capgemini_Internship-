package com.capgemini.lambdaexpressionexamples;

public interface Shape {
	public void area();

	public void perimeter();

	default void readLength() {
		System.out.println("reading length");
	}

	default void readBreadth() {
		System.out.println("reading breadth");
	}

	static void display() {
		System.out.println("display shape details");
	}
}
