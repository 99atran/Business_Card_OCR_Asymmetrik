package business_card_ocr;

/* Stores the contact information of a person as three Strings. Includes name,
 * phone number, and email address. Getters return the private data fields as Strings.*/
public class ContactInfo {
	private String name, phoneNumber, email;
	
	public ContactInfo(String name, String phone, String email) {
		this.name = name;
		this.phoneNumber = phone;
		this.email = email;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getEmailAddress() {
		return this.email;
	}
}
