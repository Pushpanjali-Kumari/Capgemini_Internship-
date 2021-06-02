package com.capgemini.contactmanagerappusingcollections;
/**
 * @author Pushpanjali
 */
import java.util.Collection;
import java.util.Scanner;

import com.capgemini.contactmanagerappusingcollections.model.Contact;
import com.capgemini.contactmanagerappusingcollections.service.ContactManager;

public class ContactMain {

	static Scanner ip = new Scanner(System.in);
	static String fname;
	static String lname;
	static String phno;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContactManager cm = new ContactManager();

		char choice = 'y';
		while (choice == 'y') {
			System.out.println("Enter the choice");
			System.out.println("enter 'a' to add contact");
			System.out.println("enter 'g' to get contact list");
			System.out.println("enter 'f' to find contact");
			System.out.println("enter 'u' to update contact list");
			System.out.println("enter 'd' to delete contact");
			char ch = ip.next().trim().charAt(0);
			switch (ch) {
			case 'a':
				readDetails();
				cm.addContact(fname, lname, phno);
				break;
			case 'g':
				Collection<Contact> data = cm.getAllContacts();
				System.out.println(data);
				break;
			case 'f':
				// cm.getContactByKey(cm.generateKey(null));
				System.out.println("code here to find a contact by key");
				break;
			case 'u':
				// cm.getContactByKey(cm.generateKey(null));
				System.out.println("code here to update a contact by key");
				break;
			case 'd':
				// cm.getContactByKey(cm.generateKey(null));
				System.out.println("code here to remove a contact by key");
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
		System.out.println("Enter the first name");
		fname = ip.next();
		System.out.println("Enter the last name");
		lname = ip.next();
		System.out.println("Enter the phone no");
		phno = ip.next();

	}
}
