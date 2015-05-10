package oop;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingTest {

}

class SuperClass{
	public static void staticMethod(){
		
	}
}

class SubClass extends SuperClass{

	public static void staticMethod(){
		
	}
}

abstract class OverrideSuper{
	public abstract SuperClass myMethod(SubClass subClass) throws IOException;
}

class OverrideSub extends OverrideSuper{

	@Override
	public SubClass myMethod(SubClass subClass) throws FileNotFoundException /*Or without throws*/{
		return null;
	}
	
}