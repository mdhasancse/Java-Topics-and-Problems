public class Mobile {
	OS os=new OS(32, "Android");//handling composition
	public void port(Charger ref)//handle aggregation
	{
		System.out.println("Charger "+ref.brand);
		System.out.println(ref.color+" is given to Mobile");
	}
}
