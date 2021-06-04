package com.capgemini.lambdaexpressionexamples;
@FunctionalInterface
public interface Substraction {
public float sub();

default void readValues() {
	System.out.println("read values");
}
static void display() {
	System.out.println("display values");
}
}
