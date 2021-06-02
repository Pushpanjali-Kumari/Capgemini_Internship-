package com.capgemini.authorusingcollections;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.authorusingcollections.model.Author;
import com.capgemini.authorusingcollections.service.AuthorDetails;

public class AuthorMain {
	static Scanner ip = new Scanner(System.in);
	static String name;
	static String email;
	static Character gender;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthorDetails ad = new AuthorDetails();

		char choice = 'y';
		while (choice == 'y') {
			System.out.println("Enter the choice");
			System.out.println("enter 'a' to add author");
			System.out.println("enter 'g' to get author list");
			System.out.println("enter 'f' to find author");
			System.out.println("enter 'u' to update author list");
			System.out.println("enter 'd' to delete autor");
			char ch = ip.next().trim().charAt(0);
			switch (ch) {
			case 'a':
				readDetails();
				ad.addAuthor(name, email, gender);
				break;
			case 'g':
				Collection<Author> data = ad.getAllAuthor();
				System.out.println(data);
				break;
			case 'f':
				// cm.getAuthorByKey(ad.generateKey(null));
				System.out.println("code here to find a Author by key");
				break;
			case 'u':
				// cm.getAuthorByKey(ad.generateKey(null));
				System.out.println("code here to update a Author by key");
				break;
			case 'd':
				// cm.getAuthorByKey(ad.generateKey(null));
				System.out.println("code here to remove a Author by key");
				break;
			default:
				break;
			}// switch
			System.out.println("Do you want to continue?");
			choice = ip.next().trim().charAt(0);
		} // while
	}

	public static void readDetails() {
		System.out.println("Enter the contact details..");
		System.out.println("Enter the name");
		name = ip.next();
		System.out.println("Enter the email");
		email = ip.next();
		System.out.println("Enter the gender('m'-male/'f'-female/'u'-unknown)");
		gender = ip.next().charAt(0);

	}
}
