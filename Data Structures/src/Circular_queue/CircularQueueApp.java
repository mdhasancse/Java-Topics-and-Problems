package Circular_queue;
import java.util.Scanner;

public class CircularQueueApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of circularqueue ");
		int n = scan.nextInt();
		
		CircularQueue circularqueue = new CircularQueue(n);
		while(true)
		{
			System.out.println("press 1 -----> insert");
			System.out.println("press 2 -----> delete");
			System.out.println("press 3 -----> display");
			System.out.println("press Any other to stop -----> stop");
			
			System.out.println("Enter the choice");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1: circularqueue.insert();
					break;
			case 2: circularqueue.delete();
					break;
			case 3: circularqueue.display();
					break;
			default: System.exit(0);
			}
		}
	}
}
