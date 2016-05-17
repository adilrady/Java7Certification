package flowcontrol.exception.assertion;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest2 {
	
	public static void thrower() throws Exception {
		try {
			throw new IOException(); // Returned in 3rd place
		}
		catch(IOException e){
			throw new FileNotFoundException(); // Returned in 2nd place
		}
		finally {
			throw new NullPointerException(); // Returned in 1st place
		}
	}

	public static void main(String[] args) {
		try {
			thrower();
		} catch (Throwable throwable) {
			System.out.println(throwable);
		}
	}
}