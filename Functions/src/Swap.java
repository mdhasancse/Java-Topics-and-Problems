
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapTwo(5,6);
		 System.out.println();
	}

	static void swapTwo(int i, int j) {
		// TODO Auto-generated method stub
		int temp = i;
		i=j;
		j=temp;
		// this change will only be valid in this fuction SCOPE only
	}
	
}
