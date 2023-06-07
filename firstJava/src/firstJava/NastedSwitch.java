package firstJava;
import java.util.Scanner;

public class NastedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int empId = in.nextInt();
		String department = in.next();
		switch (empId)
		{
		case 1:
			System.out.println("Hey Hasan your Id is 1");
			break;
		case 2:
			System.out.println("Hey Hasan your Id is 2");
			break;
		
		case 3:
			System.out.println("Emp Number 3");
			switch(department)
			{
			case "IT":
				System.out.println("You are from IT department");
				break;
				
			case "ISE":
				System.out.println("You are from ISE department");
				break;
			default:
				System.out.println("Please give valid department");
				
			}
			break;
		default:
			System.out.println("Please give valid empId");
		}

	}

}
