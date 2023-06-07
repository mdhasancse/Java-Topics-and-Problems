import java.util.Scanner;
import java.util.Arrays;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Syntax of array
//		datatype[] variable_name = new datatype[size]
//				
//		int[] res
//		ros = new int[5]
		
		Scanner in = new Scanner(System.in);
//		int[] arr = new int[5];
//		for (int i=0;i<arr.length;i++)
//		{
//			arr[i] = in.nextInt();
//		}
//		
//		for (int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i] + "");
//		}
		
		
		 // for string
		String[] str = new String[4];
		for(int i=0;i<str.length;i++)
		{
			str[i]=in.next();
		}
		System.out.println(Arrays.toString(str));
		
		// Modify
		str[1] = "Hasan";
		System.out.println(Arrays.toString(str));
		
	}

}
