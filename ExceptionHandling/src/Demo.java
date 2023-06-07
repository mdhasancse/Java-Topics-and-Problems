import java.util.Scanner;
public class Demo 
{
	public static void main(String[] args)
	{
		try {
		System.out.println("Connection Established");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers for division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);		
		}
		catch(Exception e)
		{
			//handling code 
			System.out.println("Exception....some problem ocured...");
		}
		System.out.println("Connection terminated");
	}
}
