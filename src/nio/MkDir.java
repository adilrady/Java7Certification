package nio;

import java.io.File;

public class MkDir {

	public static void main(String[] args) {
		String files[] = {"","/FFF1.txt", "/FFF/FFF2.txt", "AAA/ZZZ/EEE.txt"};
		for (String file : files) {
			File f = new File(file);
			System.out.println(f.mkdirs());
		}
	}
}
