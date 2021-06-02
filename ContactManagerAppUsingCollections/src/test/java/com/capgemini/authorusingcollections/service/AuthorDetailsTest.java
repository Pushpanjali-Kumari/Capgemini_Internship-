package com.capgemini.authorusingcollections.service;
import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Disabled;
	import org.junit.jupiter.api.DisplayName;
	import org.junit.jupiter.api.Test;

	public class AuthorDetailsTest {

		public AuthorDetails adetails;
		
		@BeforeAll
		static void setUpBeforeClass() throws Exception {
			System.out.println("should print before all tests");
		}


		@BeforeEach
		void setUp() throws Exception {
			System.out.println("should print before each tests");
			System.out.println("Instantiating the author manager");
			adetails = new AuthorDetails();
		}

		@AfterEach
		void tearDown() throws Exception {
			System.out.println("should execute after each test");
		}
		
		@AfterAll
		public static void tearDownAll() {
			System.out.println("should execute after all test");
		}
		
		@Test
		@DisplayName("disable test")
		@Disabled
		public void disabledTest() {
			throw new RuntimeException("this test is disabled test");
		}

	}


