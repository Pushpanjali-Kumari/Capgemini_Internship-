package com.capgemini.authorusingcollections.service;
/**
 * @author Pushpanjali
 */
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.authorusingcollections.model.Author;


public class AuthorDetails {
	/**
	 * default constructor
	 */
	public AuthorDetails() {
		super();
	}
	Map<String,Author> authorList = new ConcurrentHashMap<String,Author>();
	/**
	 * addAuthor Method to add author details in to author list object
	 * 
	 * @param aName gets Author name
	 * @param aEmail  gets Author email
	 * @param aGender  gets Author gender
	 */
	public void addAuthor(String aName, String aEmail, Character aGender) {
		Author author = new Author(aName, aEmail, aGender);
		validateAuthor(author);
		checkIfAuthorAlreadyExist(author);
		authorList.put(generateKey(author), author);
	}
	/**
	 * generateKey method generates key
	 * @param author
	 * @return string
	 */
	public String generateKey(Author author) {
		// TODO Auto-generated method stub
		return String.format("%s-%s", author.getName());
	}
	/**
	 * method checks whether author is already added in
	 * the list
	 * @param author
	 */
	public void checkIfAuthorAlreadyExist(Author author) {
		// TODO Auto-generated method stub
		if (authorList.containsKey(generateKey(author))) {
			throw new RuntimeException("author already exists");
		}
	}
	/**
	 * method validated the author details using some condition
	 * @param author
	 */
	public void validateAuthor(Author author) {
		// TODO Auto-generated method stub
		author.validateName();
		author.validateEmail();
		author.validateGender();

	}
	/**
	 * 
	 * @return all details of author
	 */
	public Collection<Author> getAllAuthor() {
		return authorList.values();

	}
}
