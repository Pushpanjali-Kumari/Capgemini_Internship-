package com.capgemini.authorusingcollections.model;

/**
 * 
 * @author Pushpanjali
 *
 */
public class Author {
	private String name;
	private String email;
	private Character gender;

	/**
	 * 
	 * @param name   for author's name
	 * @param email  for author's email
	 * @param gender for author's gender
	 */
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	/**
	 * default constructor
	 */
	public Author() {
		super();
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return email address
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * 
	 * @param gender
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * Overriding equals method of object class
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * Overriding to string method of object class
	 */
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}

	/**
	 * validate name
	 */
	public void validateName() {
		// TODO Auto-generated method stub
		if (this.name.isBlank()) {
			throw new RuntimeException("Name cannot be null or empty!!");

		}
	}

	/**
	 * validate email address that contains @
	 */
	public void validateEmail() {
		// TODO Auto-generated method stub
		if (!this.email.matches("^[a-zA-Z0-9+_.-]+@(.+)\\.(.+)$")) {
			throw new RuntimeException("Invalid Email!!");
		}
		if (this.email.isBlank()) {
			throw new RuntimeException("Email cannot be null or empty!!");
		}
	}

	/**
	 * validate gender
	 */
	public void validateGender() {
		// TODO Auto-generated method stub
		if (!this.gender.isLetter('m'))
			throw new RuntimeException("Invalid Input");
		else if (!this.gender.isLetter('f'))
			throw new RuntimeException("Invalid Input");
		else if (!this.gender.isLetter('u'))
			throw new RuntimeException("Invalid Input");
	}
}
