public class PlaneApp {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		
		cp.takeOff();
		cp.fly();
		cp.land();
		System.out.println("===============================");
		fp.takeOff();
		fp.fly();
		fp.land();
	}

}