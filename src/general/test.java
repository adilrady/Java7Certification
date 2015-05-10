package general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test
{

	char k = (char) 70000;
	byte b = (byte) 128;

	public test(final String s)
	{
		System.out.println(" Top " + b);
	}

	public void printNumberType(final int i)
	{
		System.out.println("Inside Integer...");
	}

	public static void printNumberType(final short s)
	{
		System.out.println("Inside Short...");
	}

	public static void main(final String[] args)
	{
		//        byte b = 1;
		//        new test("").printNumberType(b);
		//
		//        int [] tab = {1,2,3};
		//        for (int i = 0, /*int*/ j = 0; i < tab.length; i++) { //int i = 0, int j = 0 : Not Allowed
		//
		//        }
		//        Object obj = new String[]{"1", "2", "3"};
		//        System.out.println("A##B#C".split("\0").length);
		final Vehicle v = new Car();
		//		final Bike b = (Bike) v;

		//		v.printSound();
		//		b.printSound();
		new Decathlon().printSound();
		System.out.println("sasa-2".matches("-\\d+"));
		final String in = "Item(s): [*],[item2.qa],[item3.production]";

		final Pattern p = Pattern.compile("\\[(.*?)\\]");
		final Matcher m = p.matcher(in);

		while (m.find())
		{
			System.out.println(m.group(1));
		}

		System.out.printf(">%3$0,9f<\n", 10, 2, -1214.2020);
		System.out.printf(">%2$9d<\n", 10, 2, -1214.20);
		//		final File newFolder = new File("myFolder");
		//		newFolder.mkdir();
		System.out.println("%%%%%%%%%%%%%%%%% Numbers Comparison %%%%%%%%%%%%");
		numbersComparison();
	}

	private static void numbersComparison()
	{
		if (new Integer(12).equals(new Long(12)))
		{
			System.out.println("equals: Integer == Long (false)");
		}
		else if (new Integer(21).equals(21l))
		{
			System.out.println("equals: Integer == long (false)");
		}
		else if (new Integer(12).equals(21d))
		{
			System.out.println("equals: Integer == double (false)");
		}
		else if (new Integer(12) == 12) //Ok to Unbox and compare
		{
			System.out.println("equals: Integer == int (true)");
		}
	}
}

class testo extends test
{
	public testo(final String s)
	{
		super("");
		System.out.println("Down");
	}

}

class Vehicle
{
	public void printSound()
	{
		System.out.print("vehicle");
	}
}

class Car extends Vehicle
{
	@Override
	public void printSound()
	{
		System.out.print("car");
	}
}

class Bike extends Vehicle
{
	@Override
	public void printSound()
	{
		System.out.print("bike");
	}
}

class Decathlon extends Bike
{

}
