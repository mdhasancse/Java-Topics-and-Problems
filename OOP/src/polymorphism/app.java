package polymorphism;

public class app {

	public static void main(String[] args) {

		Vehicle gadi = new Vehicle();
		gadi.run(50);
		
		Vehicle kar = new Car();
		kar.run(5);
		
		Vehicle maruti = new Maruti();
		maruti.run(500);

	}

}
