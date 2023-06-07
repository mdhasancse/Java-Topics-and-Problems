public class FighterPlane extends Plane {
	@Override
	void takeOff() {
		System.out.println("Fighter Plane is taking off on small runnway");
	}
	
	@Override
	void fly() {
		System.out.println("Fighter Plane is flying very Fast");
	}
	
	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("Fighter Plane is Landing on Small runnway");
	}
}
