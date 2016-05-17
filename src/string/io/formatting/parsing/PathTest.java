package string.io.formatting.parsing;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		
		Path testFilePath = Paths.get("D:\\test\\testfile.txt");
		
		System.out.println("* File name\t\t: " + testFilePath.getFileName());
		System.out.println("* Root of the path\t: " + testFilePath.getRoot());
		System.out.println("* Parent of the target\t: "+ testFilePath.getParent());
		// print path elements
		System.out.println("Printing elements of the path: ");
		for (Path element : testFilePath) {
			System.out.println("\t path element: " + element);
		}
		
		// Normalizing Paths
		Path testPath = Paths.get("D:\\test\\..\\testfile.txt");
		System.out.println(testPath.normalize());
		
		// Absolute Path
		Path relativePath = Paths.get("..\\testfile.txt");
		System.out.println(relativePath.toAbsolutePath());
	}
	

}
