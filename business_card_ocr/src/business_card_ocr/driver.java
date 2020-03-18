package business_card_ocr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class driver {

	public static void main(String[] args) throws IOException {
		String text = new String(Files.readAllBytes(Paths.get(args[0])));
		
		ContactInfo a = BusinessCardParser.getContactInfo(text);
		System.out.println(a.getName());
		System.out.println(a.getPhoneNumber());
		System.out.println(a.getEmailAddress());
	}

}
