package makeStatic;
// To make a variable fix and anyone can access uder the class then it called static
//When we called method without object creating in this scenario we will make static method
public class DemoApp {
	static
	{
		System.out.println("Hello");
	}
	static
	{
		System.out.println("Hai");
	}
	static
	{
		System.out.println("Namaste");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How Are You ? ");
		System.out.println(Person.name);
		Person person = new Person();
	}

}
