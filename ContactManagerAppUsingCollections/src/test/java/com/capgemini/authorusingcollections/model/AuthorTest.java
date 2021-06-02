
package com.capgemini.authorusingcollections.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.contactmanagerappusingcollections.model.Contact;

/**
 * @author Pushpanjali
 *
 */
class AuthorTest {

	/**
	 * @throws java.lang.Exception
	 */
	static Author cont;
	Contact cont1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cont = new Author("Pushpanjali", "pushpanjali388@gmail.com", 'f');
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		cont = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		cont1 = new Contact();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		cont1 = null;
	}

	

	/**
	 * test for author name
	 */
	@Test
	void testGetName() {
		assertEquals("Pushpanjali", cont.getName());
	}

	/**
	 * Test method for
	 * {@link com.capgemini.authordetailscollections.model.Contact#getEmail()}.
	 */
	@Test
	void testGetEmail() {
		assertEquals("pushpanjali388@gmail.com", cont.getEmail());
	}

	/**
	 * Test method for
	 * {@link com.capgemini.authordetailsusingcollections.model.Contact#getGender()}.
	 */
	@Test
	void testGetGender() {
		assertEquals('f', cont.getGender());
	}

}
