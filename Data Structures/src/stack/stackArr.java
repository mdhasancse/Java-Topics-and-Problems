package stack;
import java.util.Scanner;
public class stackArr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n = scan.nextInt();
		
		Stack stack = new Stack(n);
		while(true)
		{
			System.out.println("press 1 ---> push");
			System.out.println("press 2 ---> pop");
			System.out.println("press 3 ---> display");
			System.out.println("Enter any other for ----> Stop");
			
			System.out.println("Enter choice");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1: stack.push();
					break;
			case 2: stack.Pop();
					break;
			case 3: stack.display();
					break;
			default:System.exit(0);
			}
		}

	}

}
