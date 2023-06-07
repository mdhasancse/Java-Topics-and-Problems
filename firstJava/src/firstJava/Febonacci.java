package firstJava;
import java.util.Scanner;

public class Febonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int start = 0;
		int cur = 1;
		int count = 2;
		
		while(count <= n)
		{
			int temp=cur;
			cur = cur+start;
			start = temp;
			count++;
		}
		
		System.out.println(cur);
	}

}
