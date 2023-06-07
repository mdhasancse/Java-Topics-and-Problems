package constructor;

public class Person {
	String name;
	int age;
	String gender;
	String bloodgroup;
	
	public Person() {
		this("Rakesh",23);
	}

	public Person(String name, int age) {
		this(45,"male");
		this.name = name;
		this.age = age;
	}

	public Person(int age, String gender) {
		this("Male","AB+ve");
		this.age = age;
		this.gender = gender;
	}

	public Person(String gender, String bloodgroup) {
		this("Rahul",56,"Male");
		this.gender = gender;
		this.bloodgroup = bloodgroup;
	}

	public Person(String name, int age, String gender) {
		this("Saaheed",22,"male","ARh+ve");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Person(String name, int age, String gender, String bloodgroup) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bloodgroup = bloodgroup;
	}
	
	
}
