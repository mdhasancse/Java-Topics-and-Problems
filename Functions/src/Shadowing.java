
public class Shadowing {
	
	static int x = 90; // this will be shadowed at line 9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x); //90
		int x = 40;
		System.out.println(x); //40
		fun();

	}
	static void fun() {
		// TODO Auto-generated method stub
		System.out.println(x);
	}

}
