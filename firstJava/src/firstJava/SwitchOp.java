package firstJava;
import java.util.Scanner;

public class SwitchOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		String fruit = in.next();
//		
//		switch (fruit)
//		{
//		
//		case "Mango":
//			System.out.println("Sweet Fruit");
//			break;
//		case "Apple":
//			System.out.println("red sweet Fruit");
//			break;
//		case "graps":
//			System.out.println("small Sweet Fruit");
//			break;
//		default:
//			System.out.println("Enter valid feuit");
//			break;
//			
//		}
//
//	
	
	int day = in.nextInt();
	switch (day)
	{
	case 1:
		System.out.println("its Monday");
		break;
	case 2:
		System.out.println("its Tuesdat");
		break;
	case 3:
		System.out.println("its Wednesday");
		break;
	case 4:
		System.out.println("its Thrusday");
		break;
	case 5:
		System.out.println("its Friday");
		break;
	case 6:
		System.out.println("its Sturday");
		break;
	case 7:
		System.out.println("its Sunday");
		break;
	}

	}
}