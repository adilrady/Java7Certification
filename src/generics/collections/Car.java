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
