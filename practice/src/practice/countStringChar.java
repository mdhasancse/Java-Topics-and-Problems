package practice;
import java.util.Scanner; 

public class countStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int l = str.length();
		char[] ch = str.toCharArray();
		int count=0;
		for(int i=1;i<=ch.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}

}
