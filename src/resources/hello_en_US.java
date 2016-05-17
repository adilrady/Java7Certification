package resources;

import java.util.ListResourceBundle;

public class hello_en_US extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		return new Object[][]{{"hello", "hello from class"}};
	}

}
