package com.capgemini.collectionsexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;



public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> alphabets=new ArrayList<Character>();
		
		alphabets.add('A');
		alphabets.add('B');
		alphabets.add('C');
		alphabets.add('A');
		alphabets.add(null);
		alphabets.add('T');
		System.out.println(alphabets);
	
	//for each method on array
	for(Character al:alphabets) {
		System.out.println(al);
	}
	//using for loop
	System.out.println("array list using for loop");
	for(int i=0;i<alphabets.size();i++) {
		System.out.println(alphabets.get(i));
	}
	//using iterator
	System.out.println("array list using iterator");
	Iterator<Character> chitr=alphabets.iterator();
	while(chitr.hasNext()) {
		System.out.println(chitr.next());
	}
	//using ListIterator
	System.out.println("array list using list iterator in forward direction");
	ListIterator<Character> chLitr=alphabets.listIterator();
	while(chLitr.hasNext()) {
		System.out.println(chLitr.next());
		
	}
	System.out.println("array list using list iterator in backward direction");
	while(chLitr.hasPrevious()) {
		System.out.println(chLitr.previous());
		
	}
	//to remove an element from array
	Scanner sc =new Scanner(System.in);
	Character ch=sc.next().trim().charAt(0);
	alphabets.remove(ch);
	System.out.println("updated list="+alphabets);
	
	System.out.println("enter the index of the element to remove");
	int i=sc.nextInt();
	alphabets.remove(i);
	System.out.println("updated list="+alphabets);
	
	
		
	}
}

