package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import contactService.ContactService;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		contactService.AddContact("1", "8161 Redwood Drive", "Dalton", "Walls", "4195552988");
		assertTrue(contactService.contactList.containsKey("1"));
	}
	
	@Test
	void testIDAlreadyExists() {
		ContactService contactService = new ContactService();
		contactService.AddContact("1", "8161 Redwood Drive", "Dalton", "Walls", "4195552988");
		
		Assertions.assertThrows(IllegalArgumentException.class, 
				() -> {contactService.AddContact("1", "8121 Redwoo", "Dalto", "Wall", "4195952988");}
				);
	}
	
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		contactService.AddContact("1", "8161 Redwood Drive", "Dalton", "Walls", "4195552988");
		
		contactService.DeleteContact("1");
		assertFalse(contactService.contactList.containsKey("1"));
	}
	
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
		contactService.AddContact("1", "8161 Redwood Drive", "Dalton", "Walls", "4195552988");
		
		contactService.UpdateContact("1", "8161 Hollywoo Drive", "Daltoo", "Wall", "4195952988");
		assertTrue(contactService.contactList.get("1").GetID() == "1");
		assertTrue(contactService.contactList.get("1").GetAddress() == "8161 Hollywoo Drive");
		assertTrue(contactService.contactList.get("1").GetFirstName() == "Daltoo");
		assertTrue(contactService.contactList.get("1").GetLastName() == "Wall");
		assertTrue(contactService.contactList.get("1").GetPhoneNumber() == "4195952988");
	}

}
