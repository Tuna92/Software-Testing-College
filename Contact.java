package contactService;

public class Contact {

	private String contactID;
	private String contactAddress;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	public Contact(String id, String address, String firstName, String lastName, String number) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if (number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		this.contactID = id;
		this.contactAddress = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = number;
	}
	
	public String GetID() {
		return contactID;
	}
	public String GetAddress() {
		return contactAddress;
	}
	public String GetFirstName() {
		return firstName;
	}
	public String GetLastName() {
		return lastName;
	}
	public String GetPhoneNumber() {
		return phoneNumber;
	}


	public void SetAddress(String address) {
		this.contactAddress = address;
	}
	public void SetFirstName(String name) {
		this.firstName = name;
	}
	public void SetLastName(String name) {
		this.lastName = name;
	}
	public void SetPhoneNumber(String number) {
		this.phoneNumber = number;
	}
	
}
