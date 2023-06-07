package aboutConstr;

public class Demo2 extends Demo1 {
	int id;
	String email;
	public Demo2() {
		this(10);
	}
	public Demo2(int id) {
		this(30,"Sandi@san.com");
		this.id = id;
	}
	public Demo2(int id, String email) {
		super("Jagga",30,"Male");
		this.id = id;
		this.email = email;
	}
	
}