package localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		
		Locale en_US = new Locale("en", "US");
		// create a new ResourceBundle with default locale
		ResourceBundle bundle = ResourceBundle.getBundle("resources.hello", en_US);

		// print the text assigned to key "hello"
		System.out.println("" + bundle.getString("hello"));

	}
}
