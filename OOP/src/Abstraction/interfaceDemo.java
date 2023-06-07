package Abstraction;

interface A{
	void sit();
	void walk();
	void run();
	
}
class B implements A{
	public void sit()
	{
		System.out.println("chup chaap se baih ja ");
	}
	public void walk()
	{
		System.out.println("chalo kahi walk pe chalte hai  ");
	}
	public void run()
	{
		System.out.println("Ajj running karna hai 5km atleas");
	}
}

public class interfaceDemo {

	public static void main(String[] args) {
		A a = new B();
		a.sit();
		a.walk();
		a.run();
		
		

	}

}
