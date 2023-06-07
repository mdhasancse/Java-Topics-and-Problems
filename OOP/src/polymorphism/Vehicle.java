package polymorphism;

public class Vehicle {
//	public void run(String type)
//	{
//		System.out.println("gari durta hai"+ type);
//	}
	public void run(int tires)
	{
		System.out.println(" parents class ka gari gurukta hai "+tires);
	}
}
class Car extends Vehicle{
	public void run(int tires) {
		System.out.println("child class ka car gurukta hai "+tires);
	}
}
class Maruti extends Vehicle{
	public void run(int tires) {
		System.out.println("grand child class ki maruti bhot fast hai "+tires);
	}
}

