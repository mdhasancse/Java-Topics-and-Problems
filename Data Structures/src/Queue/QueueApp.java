package Queue;
import java.util.Scanner;
public class QueueApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the queue size ");
		int n = scan.nextInt();
		
		Queue queue = new Queue(n);
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
			case 1: queue.insert();
					break;
			case 2: queue.delete();
					break;
			case 3: queue.display();
					break;
			default: System.exit(0);
			}
		}
	}

}
