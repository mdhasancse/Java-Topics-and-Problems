package SinglyLinkedList;
import java.util.Scanner;
public class LinkedList {
	
	class Node{
		int data;
		Node link;
	}
	private Node first;
	private Scanner scan = new Scanner(System.in);
	
	// Insert Rear end method
	public void insertrear()
	{
		Node temp;
		System.out.println("enter an element");
		int elem = scan.nextInt();
		Node newnode = new Node();
		newnode.data = elem;
		newnode.link = null;
		if(first == null)
		{
			first = newnode;
		}
		else
		{
			temp = first;
			while(temp.link != null)
			{
				temp = temp.link;
			}
			temp.link = newnode;
		}
	}
	
	//delete from rear end
	public void deleterear()
	{
		Node temp;
		if(first == null)
		{
			System.out.println("deletion not possible");
		}
		if(first.link == null)
		{
			System.out.println("element deleted is "+first.data);
			first = null;
		}
		else
		{
			temp = first;
			while(temp.link.link != null)
			{
				temp = temp.link;
			}
			System.out.println("element deleted is "+temp.link.data);
			temp.link = null;
		}
	}
	
	//insert front
	public void inserfront()
	{
		System.out.println("enter an element");
		int elem = scan.nextInt();
		Node newnode = new Node();
		newnode.data = elem;
		newnode.link = null;
		if(first == null)
		{
			first = newnode;
		}
		else
		{
			newnode.link = first;
			first = newnode;
		}
	}
	
	// delete from front
	public void deletefront()
	{
		if(first == null)
		{
			System.out.println("Deletion not possible");
		}
		else if(first.link == null)
		{
			System.out.println("element deleted is "+first.data);
			first = null;
		}
		else
		{
			System.out.println("element deleted is "+first.data);
			first = first.link;
		}
	}
	
	// display element
	public void display()
	{
		Node temp;
		if(first == null)
		{
			System.out.println("deletion not possible");
		}
		else if(first.link == null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp = first;
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.link;
			}
			System.out.println();
		}
	}
}

