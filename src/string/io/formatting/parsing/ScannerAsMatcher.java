package string.io.formatting.parsing;

import java.util.Scanner;

/**
 * Example from Page 501
 * */
public class ScannerAsMatcher {

	public static void main(String[] args) {
		scanIt("1b2c335f456", "\\d\\d");
	}

	private static void scanIt(String str, String regex) {
		try {
			Scanner s = new Scanner(str);
			String token;
			do {
				token = s.findInLine(regex);
				System.out.println("found " + token);
			} while (token != null);
			s.close();
		} catch (Exception e) {
			System.out.println("scan exc");
		}
	}
}
