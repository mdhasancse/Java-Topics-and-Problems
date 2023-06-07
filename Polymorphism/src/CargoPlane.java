
public class CargoPlane extends Plane {
	@Override
	void takeOff() {
		System.out.println("Cargo Plane is taking off on huge runnway");
	}
	
	@Override
	void fly() {
		System.out.println("Cargo Plane is flying very slow");
	}
	
	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("Cargo Plane is Landing on huge runnway");
	}
}
