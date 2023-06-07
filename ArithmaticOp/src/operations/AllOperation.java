package operations;
import java.util.Scanner;

public class AllOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b ");
		int b = sc.nextInt();
		System.out.println(add(a,b));

	}
	static int add(int a, int b)
	{
		return a+b;
	}
	static int sub(int a, int b)
	{
		return a-b;
	}
	static int multiply(int a, int b)
	{
		return a*b;
	}
	static int div(int a, int b)
	{
		return a/b;
	}
	
}
