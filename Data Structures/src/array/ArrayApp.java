package array;
import java.util.Scanner;
public class ArrayApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n = scan.nextInt();
		Array a = new Array(n);
		while(true)
		{
			System.out.println("press 1 -----> insert");
			System.out.println("press 2 -----> delete");
			System.out.println("press 3 -----> display");
			System.out.println("press any other number for stop -----> stop");
			
			System.out.println("Enter the choice");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1: a.insert();
					break;
			case 2: a.delete();
					break;
			case 3: a.display();
					break;
			default: System.exit(0);
			}
		}
	}

}
