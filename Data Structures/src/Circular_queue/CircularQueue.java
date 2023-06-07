package Circular_queue;
import java.util.Scanner;
public class CircularQueue {
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	
	private Scanner scan = new Scanner(System.in);
	
	public CircularQueue(int n)
	{
		cq = new int[n];
		size = cq.length;
	}
	
	// Insertion
	public void insert() {
		if(count==size)
		{
			System.out.println("Insertion not possible");
		}else {
			System.out.println("Enter an element");
			int elem = scan.nextInt();
			r = (r+1)%size;
			cq[r] = elem;
			count++;	
		}
	}
	
	// Delete
	public void delete()
	{
		if(count == 0)
		{
			System.out.println("Delete not possible");
		}else {
			System.out.println("element deleted is "+cq[f]);
			f = (f+1)%size;
			count--;
		}
	}
	
	//Display
	public void display()
	{
		int f1 = f;
		if(count==0)
		{
			System.out.println("Display not possible");
		}else {
			for(int i=1;i<=count;i++)
			{
				System.out.print(cq[f1]+" ");
				f1 = (f1+1)%size;
			}
			System.out.println();
		}
	}
	
}
