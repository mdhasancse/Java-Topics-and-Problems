// Scope fun. use only inside the function

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 10;
		 int b = 20;
	
	{
//		int a = 45;  Already initialised outside the block in the same method, hence you cannt initialize again
		a = 100; // reassign the original ref. to someother value
		System.out.println(a);
		int c = 99;
		// value initialized in this block,  will remain in block
	}
	System.out.println(a);
//	System.out.println(c);  Cannot use outside the block
}
		static void main(int marks)
		{
			int num = 98;
			System.out.println(num);
			System.out.println(marks);
			// we can not use a and b values in this fuction so its called scope fun.
		}
}
