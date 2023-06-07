import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		// syntax
		ArrayList<Integer> list = new ArrayList<>(10);
//		list.add(23);
//		list.add(213);
//		list.add(323);
//		list.add(13);
//		list.add(55);
//		list.add(77);
//		list.add(253);
//		list.add(723);
//		
//		System.out.println(list);
//		System.out.println();
//		
//		System.out.println((list.contains(554)));
//		System.out.println();
//		
//		list.set(0, 99);
//		System.out.println(list);
//		System.out.println();
//		
//		list.remove(2);
//		System.out.println(list);
//		System.out.println();
//		
		
		// Input
		for(int i=0;i<5;i++)
		{
			list.add(in.nextInt());
		}
		// get item at any index
		for(int i=0;i<5;i++)
		{
			System.out.print(list.get(i)+" "); //pass index here, list[index] syntax will not work here 
		}
//		System.out.println(list);
	}

}
