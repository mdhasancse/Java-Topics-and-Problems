package SinglyLinkedList;

import java.util.Scanner;
public class LinkedlistApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		LinkedList ll = new LinkedList();
		while(true)
		{
			System.out.println("press 1 -----> Insert Rear");
			System.out.println("press 2 -----> delete Rear");
			System.out.println("press 3 -----> Insert front");
			System.out.println("press 4 -----> delete front");
			System.out.println("press 5 -----> display");
			System.out.println("press any other number for stop -----> stop");
			
			System.out.println("Enter the choice");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1: ll.insertrear();
					break;
			case 2: ll.deleterear();;
					break;
			case 3: ll.inserfront();
					break;
			case 4: ll.deletefront();
					break;
			case 5: ll.display();
					break;
			default: System.exit(0);
	
			}
		}
	}
}
