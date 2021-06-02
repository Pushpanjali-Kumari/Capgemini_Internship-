package com.capgemini.contactmanagerappusingcollections.service;

/**
 * @author Pushpanjali
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ContactManagerTest {
	/**
	 * object of contact manager class
	 */
	private ContactManager contManager;

	@BeforeAll
	public static void setupAll() {
		System.out.println("should print before all tests");
	}

	@BeforeEach
	public void setup() {
		System.out.println("should print before each tests");
		System.out.println("Instantiating the contact manager");
		contManager = new ContactManager();
	}

	@Test
	@DisplayName("should create contact")
	public void shouldCreateContact() {
		contManager.addContact("Rama", "Krishna", "08051565758");
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1, contManager.getAllContacts().size());
	}

	@Test
	@DisplayName("should not create contact is first name is null")
	public void shouldThrowRunTimeExceptionWhenFirstNameIsNull() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			contManager.addContact(null, "Krishna", "08051565758");
		});

	}

	@Test
	@DisplayName("should not create contact is last name is null")
	public void shouldThrowRunTimeExceptionWhenLastNameIsNull() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			contManager.addContact("Rama", null, "08051565758");
		});

	}

	@Test
	@DisplayName("should not create contact is phone number is null")
	public void shouldThrowRunTimeExceptionWhenPhNoIsNull() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			contManager.addContact("Rama", "Krishna", null);
		});
	}

	@Test
	@DisplayName("should not create contact is phone number starts with 0")
	public void shouldThrowRunTimeExceptionWhenPhoneNumberForamt() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			contManager.addContact("Rama", "Krishna", "80515756589");
		});
	}

	@Nested
	class RepeatedTests {
		@DisplayName("should create contact")
		@RepeatedTest(value = 5, name = "Repeating contact creatio test{currentRepetition}of{totalRepetition}")
		public void shouldCreateContactRepetedly() {
			contManager.addContact("Rama", "Krishna", "08051565758");
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1, contManager.getAllContacts().size());
		}
	}

	@Nested
	class ParameterizedTests {
		@DisplayName("Phone number should match with required format")
		@ParameterizedTest
		@ValueSource(strings = { "09876543211", "09876543212", "09876543213" })
		public void shouldTestPhoneNumberFormatUsingSource(String phoneNumber) {
			contManager.addContact("Rama", "Krishna", phoneNumber);
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1, contManager.getAllContacts().size());
		}
	}

	private static List<String> phoneNumberList() {
		return Arrays.asList("09876543211", "09876543212", "09876543213");
	}

	@DisplayName("Phone number should match with required format")
	@ParameterizedTest
	@MethodSource("phoneNumberList")
	public void shouldTestPhoneNumberFormatUsingValueSource(String phoneNumber) {
		contManager.addContact("Rama", "Krishna", phoneNumber);
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1, contManager.getAllContacts().size());
	}

	@Test
	@DisplayName("disable test")
	@Disabled
	public void disabledTest() {
		throw new RuntimeException("this test is disabled test");
	}

	@AfterEach
	public void tearDown() {
		System.out.println("should execute after each test");
	}

	@AfterAll
	public static void tearDownAll() {
		System.out.println("should execute after all test");
	}
}
