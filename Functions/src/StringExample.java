import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String message = greet();
//		System.out.println(message);
		
//		String personalisedMsg = myGreet("Md Hasan");
//		System.out.println(personalisedMsg);
//		//orr
		Scanner in = new Scanner(System.in);
		System.out.println("Enter yor name");
		String naam = in.nextLine();
		String personalisedMsg = myGreet(naam);
		System.out.println(personalisedMsg);
		
	}

	static String myGreet(String name) {
		// TODO Auto-generated method stub
		String message = "Hello "+name;
		return message;
	}
	
	
//	static String greet()
//	{
//		String greeting = "Hey you listen ";
//		return greeting;
//	}

}
