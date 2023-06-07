package firstJava;
import java.util.Scanner;

public class CseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char ch = in.next().trim().charAt(0);
//		System.out.println(ch);
//		String word = "Hello";
//		System.out.println(word.charAt(0));
		
		//case checking
		if (ch >= 'a' && ch <= 'z')
		{
			System.out.println("Lower case");
		}else
		{
			System.out.println("Upper case");
		}
		
	}

}
