package multipleInheritance;

public class Demo1 implements Interface1,Interface2{

	@Override
	public void add() {
		System.out.println("Addition");
	}

	@Override
	public void sub() {
		System.out.println("Subtraction");
	}

}