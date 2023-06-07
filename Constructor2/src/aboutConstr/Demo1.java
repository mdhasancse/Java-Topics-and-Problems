package aboutConstr;

public class Demo1 
{
	String name;
	int age;
	String gender;
	
	public Demo1() {
		// TODO Auto-generated constructor stub
	}

	public Demo1(String name) {
		this();
		this.name = name;
	}

	public Demo1(String name, int age) {
		this("Rohan");
		this.name = name;
		this.age = age;
	}

	public Demo1(String name, int age, String gender) {
		this("Raju",25);
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
}
