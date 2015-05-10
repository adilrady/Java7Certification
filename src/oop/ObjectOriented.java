package oop;


public class ObjectOriented
{

	public static void main(final String[] args)
	{
		final Vehicle v = new Car();
		v.printSound();
		//		final Bike b = (Bike) v;

		//		v.printSound();
		//		b.printSound();

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
