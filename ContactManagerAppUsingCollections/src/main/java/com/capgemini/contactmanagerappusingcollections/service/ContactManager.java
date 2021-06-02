package com.capgemini.contactmanagerappusingcollections.service;

import java.util.Collection;
import java.util.Map;

import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.contactmanagerappusingcollections.model.Contact;

//documentation comments used to generate documentation for the code
/**
 * ContactManager class used to store data in map
 * 
 * @author Pushpanjali
 *
 */
public class ContactManager {

	/*
	 * //multi line comments //concurenthashmap is the collection which allows us to
	 * retrieve and modify the data while iterating through the collections of
	 * objects inside map
	 * 
	 * ConcurrentHashMap Object to store contact list and test the same
	 * 
	 */
	/**
	 * @default constructor
	 */
	public ContactManager() {
		super();
	}

	Map<String, Contact> contactList = new ConcurrentHashMap<String, Contact>();

	/**
	 * addContact Method to add contacts in to contact list object
	 * 
	 * @param firstName gets first name
	 * @param lastName  gets last name
	 * @param phoneNo   gets phone number
	 */
	public void addContact(String firstName, String lastName, String phoneNo) {
		Contact contact = new Contact(firstName, lastName, phoneNo);
		validateContact(contact);
		checkIfContactAlreadyExist(contact);
		contactList.put(generateKey(contact), contact);
	}

	/**
	 * generateKey method generates key
	 * 
	 * @param contact
	 * @return String
	 */
	public String generateKey(Contact contact) {
		// TODO Auto-generated method stub
		return String.format("%s-%s", contact.getfName(), contact.getlName());
	}

	/**
	 * checkIfContactAlreadyExist method checks whether contact is already added in
	 * the list
	 * 
	 * @param contact
	 */

	public void checkIfContactAlreadyExist(Contact contact) {
		// TODO Auto-generated method stub
		if (contactList.containsKey(generateKey(contact))) {
			throw new RuntimeException("contact already exists");
		}
	}

	/**
	 * validateContact method validated the contact details using some condition
	 * 
	 * @param contact
	 */
	public void validateContact(Contact contact) {
		// TODO Auto-generated method stub
		contact.validateFirstName();
		contact.validateLastName();
		contact.validatePhNo();

	}

	/**
	 * 
	 * @return all values of contactsList
	 */
	public Collection<Contact> getAllContacts() {
		return contactList.values();

	}

	

}
