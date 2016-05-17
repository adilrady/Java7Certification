package nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeResolveTest {

	
	public static void main(String[] args) {
		Path p1 = Paths.get("c:/a/b");
		Path p2 = Paths.get("c:/a/b/c/file");
		Path p3 = Paths.get("d:/a/b/c/file");
		Path p4 = Paths.get("c:/a/b/c");
		
		System.out.println(p1.relativize(p2));
		System.out.println(p2.relativize(p1));
		System.out.println(p1.resolve(p3));
		System.out.println(p2.resolve(p1));
		
		
		Path dir = Paths.get("c:\\x");
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "**.txt")){
			
			for (Path path : stream) {
				System.out.println(path);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
