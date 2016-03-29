package generics.collections;

public class Car
{

    private String name;
    private int passengerCapacity;
    
    public Car(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return name+" / Capacity: "+passengerCapacity;
    }
}

//Abstract class Can be derived from a concrete one. Although this is possible but recommended 
abstract class AbstractCar extends Car {

	public AbstractCar(String name, int passengerCapacity) {
		super(name, passengerCapacity);
	}
	
}