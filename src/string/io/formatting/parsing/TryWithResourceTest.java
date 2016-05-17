package string.io.formatting.parsing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceTest {

	public static void main(String[] args) {
		try (FileReader inputFile
				= new FileReader(new File("file.txt"))) {
				//...
				}
				catch(IOException ioe) {}
				finally {/*...*/} // Even with final it compiles, BUT not the correct usage when using try-with-resource
	}
}
