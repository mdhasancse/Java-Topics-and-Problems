import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		// Initialization
		for(int i=0;i<3;i++)
		{
			list.add(new ArrayList<>());
		}
		
		// Add elements
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) {
			list.get(i).add(in.nextInt());
		}
		}
		System.out.println(list);
	}

}
