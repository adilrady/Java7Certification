package oop;

public abstract class AbstractTest {

//	public void method1();	//This method requires a body instead of a semicolon
	abstract Number dodo();
	
}

class Do extends AbstractTest{

	@Override
	Double dodo() {
		return new Double(1.12d);
		
	}
	
}