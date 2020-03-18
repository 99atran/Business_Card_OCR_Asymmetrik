package business_card_ocr;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.*;

import org.junit.jupiter.api.Test;

/* Test file for the three example cases to ensure correctness. Saved all documents as
 * .txt files, and read each one in and converted into a String, which is used to call
 * the parser method and test its results.*/
class BusinessCardParserTest {

	@Test
	void test01() {
		try {
			String text = new String(Files.readAllBytes(Paths.get("src/test01.txt")));
			ContactInfo a = BusinessCardParser.getContactInfo(text);
			assertTrue(a.getName().equals("Mike Smith"));
			assertTrue(a.getPhoneNumber().equals("4105551234"));
			assertTrue(a.getEmailAddress().equals("msmith@asymmmetrik.com"));
			
		} catch (IOException e) {
			
		}
	}
	
	@Test
	void test02() {
		try {
			String text = new String(Files.readAllBytes(Paths.get("src/test02.txt")));
			ContactInfo a = BusinessCardParser.getContactInfo(text);
			assertTrue(a.getName().equals("Lisa Haung"));
			assertTrue(a.getPhoneNumber().equals("4105551234"));
			assertTrue(a.getEmailAddress().equals("lisa.haung@foobartech.com"));
			
		} catch (IOException e) {
			
		}
	}
	
	@Test
	void test03() {
		try {
			String text = new String(Files.readAllBytes(Paths.get("src/test03.txt")));
			ContactInfo a = BusinessCardParser.getContactInfo(text);
			assertTrue(a.getName().equals("Arthur Wilson"));
			assertTrue(a.getPhoneNumber().equals("17035551259"));
			assertTrue(a.getEmailAddress().equals("awilson@abctech.com"));
			
		} catch (IOException e) {
			
		}
	}
	
}
