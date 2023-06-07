package doublyLinkedList;

import java.util.Scanner;
public class DoublyLLapp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DoublyLinkedList dll = new DoublyLinkedList();
		while(true)
		{
			System.out.println("press 1 -----> insert rear");
			System.out.println("press 2 -----> delete rear");
			System.out.println("press 3 -----> insert front");
			System.out.println("press 4 -----> delete front");
			System.out.println("press 5 -----> display forword");
			System.out.println("press 6 -----> display reverse");
			System.out.println("press Any other to stop -----> stop");
			
			System.out.println("Enter the choice");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1: dll.InsertRear();
					break;
			case 2: dll.deleteRear();
					break;
			case 3: dll.InsertFront();
					break;		
			case 4: dll.deleteFront();
					break;
			case 5: dll.displayForword();
					break;
			case 6: dll.displayReverse();
					break;
			default: System.exit(0);
			}
		}
	}
}