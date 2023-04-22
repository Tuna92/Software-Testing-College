package contactService;

import java.util.Enumeration;
import java.util.Hashtable;

public class ContactService {
	
	public Hashtable<String, Contact> contactList = new Hashtable<String, Contact>();

	public void AddContact(String id, String address, String firstName, String lastName, String number) {
		Enumeration<String> enumerator = contactList.keys();
		
		while(enumerator.hasMoreElements()) {
			if (enumerator.nextElement() == id) {
				throw new IllegalArgumentException("ID Already Exists");
			}
		}
		
		Contact contact = new Contact(id, address, firstName, lastName, number);
		
		contactList.put(contact.GetID(), contact);
	}
	
	public void DeleteContact(String id) {
		Enumeration<String> enumerator = contactList.keys();
		
		while(enumerator.hasMoreElements()) {
			if (enumerator.nextElement() == id) {
				contactList.remove(id);
			}
		}	
	}
	
	public void UpdateContact(String id, String address, String firstName, String lastName, String number) {
		Contact contact;
		Enumeration<String> enumerator = contactList.keys();
		
		while(enumerator.hasMoreElements()) {
			if (enumerator.nextElement() == id) {
				contact = contactList.get(id);
				contact.SetAddress(address);
				contact.SetFirstName(firstName);
				contact.SetLastName(lastName);
				contact.SetPhoneNumber(number);
			}
		}	
	}
	
}
