package oop;

class Base {

	public Base() {
		foo();
	}
	
	public void foo() {
		System.out.println("foo of Base");
	}
	
	boolean equals(Base o){  //Not override of Object.equals
		return true;
	}
}

class Derived extends Base{
	public Derived() {
		var = "HELLO";
	}
	
	@Override
	public void foo() {
		System.out.println("foo of Derived : "+var.toLowerCase());
	}
	String var;
}

public class OverrideTest2{
	public static void main(String[] args) {
		Base test = new Derived(); //NullPointerException
	}
}