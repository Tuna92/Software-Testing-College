package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import contactService.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1", "8161 Redwood Drive", "Dalton", "Walls", "4195552988");
		assertTrue(contact.GetID().equals("1"));
		assertTrue(contact.GetAddress().equals("8161 Redwood Drive"));
		assertTrue(contact.GetFirstName().equals("Dalton"));
		assertTrue(contact.GetLastName().equals("Walls"));
		assertTrue(contact.GetPhoneNumber().equals("4195552988"));
	}
	
	@Test
	void testIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {new Contact("12345678911", "8161 Redwood Drive", "Dalton", "Walls", "4195552988");}
				);
	}
	
	@Test
	void testIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {new Contact(null, "8161 Redwood Drive", "Dalton", "Walls", "4195552988");}
				);
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {new Contact("1", "8161 Redwood Drive, Findlay, Ohio, USA", "Dalton", "Walls", "4195552988");}
				);
	}
	
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {new Contact("1", null, "Dalton", "Walls", "4195552988");}
				);
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {new Contact("1", "8161 Redwood Drive", "Daltonius The Third", "Walls", "4195552988");}
				);
	}
	
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {new Contact("1", "8161 Redwood Drive", null, "Walls", "4195552988");}
				);
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {new Contact("1", "8161 Redwood Drive", "Dalton", "Walls-Picasso", "4195552988");}
				);
	}
	
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {new Contact("1", "8161 Redwood Drive", "Dalton", null, "4195552988");}
				);
	}
	
	@Test
	void testPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {new Contact("1", "8161 Redwood Drive", "Dalton", "Walls", "419552988");}
				);
	}
	
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {new Contact("1", "8161 Redwood Drive", "Dalton", "Walls", "41955529889");}
				);
	}
	
	@Test
	void testPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {new Contact("1", "8161 Redwood Drive", "Dalton", "Walls", null);}
				);
	}

}
