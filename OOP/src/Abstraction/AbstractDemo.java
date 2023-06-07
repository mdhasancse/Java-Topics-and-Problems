package Abstraction;

abstract class Bike{
	abstract void run();
//	public void walk() {
//		System.out.println("We are walking in abstract class");
//	}
//	abstract void song();
	
}
class Honda extends Bike{
	public void run() {
		System.out.println("Honda bike is running");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Bike bk = new Honda();
		bk.run();
//		bk.walk();

	}

}
