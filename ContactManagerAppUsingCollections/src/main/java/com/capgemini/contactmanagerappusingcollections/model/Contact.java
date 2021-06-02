package com.capgemini.contactmanagerappusingcollections.model;

/**
 * 
 * @author Pushpanjali
 *
 */
public class Contact {
	private String fName;
	private String lName;
	private String phNo;

	/**
	 * 
	 * @param fName is for firstName
	 * @param lName is for lastName
	 * @param phNo  is for phone number
	 */
	public Contact(String fName, String lName, String phNo) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phNo = phNo;
	}

	/**
	 * default constructor
	 */
	public Contact() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((phNo == null) ? 0 : phNo.hashCode());
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
		Contact other = (Contact) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (phNo == null) {
			if (other.phNo != null)
				return false;
		} else if (!phNo.equals(other.phNo))
			return false;
		return true;
	}

	/**
	 * 
	 * @return first Name
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * 
	 * @param first Name
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * 
	 * @return last name
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * 
	 * @return phone number
	 */
	public String getPhNo() {
		return phNo;
	}

	/**
	 * 
	 * @param phoneNo
	 */
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	/**
	 * Overriding to string method of object class
	 */
	@Override
	public String toString() {
		return "Contact [fName=" + fName + ", lName=" + lName + ", phNo=" + phNo + "]";
	}

	/**
	 * validate first name
	 */
	public void validateFirstName() {
		// TODO Auto-generated method stub
		if (this.fName.isBlank()) {
			throw new RuntimeException("First name cannot be null or empty");

		}
	}

	/**
	 * validate last name
	 */

	public void validateLastName() {
		// TODO Auto-generated method stub
		if (this.lName.isBlank()) {
			throw new RuntimeException("Last name cannot be null or empty");
		}
	}

	/**
	 * validate phone number
	 */
	public void validatePhNo() {
		// TODO Auto-generated method stub
		if (this.phNo.isBlank()) {
			throw new RuntimeException("Phone number cannot be null or empty");
		}
		if (this.phNo.length() != 11) {
			throw new RuntimeException(" Phone number should be 10 digits long");
		}
		if (!this.phNo.matches("\\d+")) {
			throw new RuntimeException("Phone number can contain only digits");
		}
		if (!this.phNo.startsWith("0")) {
			throw new RuntimeException("Phone number should start with 0");
		}
	}

}
