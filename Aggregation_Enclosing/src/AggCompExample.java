public class AggCompExample {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		System.out.println(mobile.os.name);
		System.out.println(mobile.os.type);
		
		Charger charger=new Charger("Black", "MI");
		mobile.port(charger);
		
		mobile=null;
		System.out.println("Mobile is destroyed..");
		//Composite objects cannot be accessed if enclosing object is destroyed
	//	System.out.println(mobile.os.name);
	//	System.out.println(mobile.os.type);
		
		
		//Aggregate objects can be accessed if enclosing object is destroyed
		System.out.println(charger.brand);
		System.out.println(charger.color);
		
	}

}