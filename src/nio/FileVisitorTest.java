package nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
	
	
	public FileVisitResult visitFile(Path path,	BasicFileAttributes fileAttributes) {
		System.out.println("file name:" + path.getFileName());
		return FileVisitResult.CONTINUE;
	}

	public FileVisitResult preVisitDirectory(Path path,	BasicFileAttributes fileAttributes) {
		System.out.println("----------Directory name:" + path + "----------");
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult postVisitDirectory(Path path, IOException ex){
		System.out.println(">>>>>>>>> End visit of : "+path);
		return FileVisitResult.CONTINUE;
	}
}

public class FileVisitorTest {
	public static void main(String[] args) {

		Path pathSource = Paths.get("C:\\Users\\user\\Desktop\\Folder");
		try {
			Files.walkFileTree(pathSource, new MyFileVisitor());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
