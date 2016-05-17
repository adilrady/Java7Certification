package localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		
		Locale en_US = new Locale("en", "US");
		Locale it_IT = new Locale("it", "IT");
		Locale de_DE = new Locale("en_DE");
		Locale.setDefault(it_IT);
		// create a new ResourceBundle with default locale
		ResourceBundle bundle = ResourceBundle.getBundle("resources.hello", de_DE);

		// print the text assigned to key "hello"
		System.out.println("" + bundle.getString("hello"));
		
//		No
//		Locale locale5 = new Locale(Locale.US);

	}
}
