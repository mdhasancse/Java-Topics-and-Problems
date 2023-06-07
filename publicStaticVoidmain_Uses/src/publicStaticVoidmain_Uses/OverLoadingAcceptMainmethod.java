package publicStaticVoidmain_Uses;

// Overloading accept the multiple main method but signature should be different
public class OverLoadingAcceptMainmethod {
	public static void main(String[] args) {
		System.out.println("Hello World");
		main();
		int arr[]= {1,2,3,4,5};
		main(arr);
	}	
	void main(int a)
	{
		
	}	
	public static void main() 
	{
		System.out.println("Hello World");
	}	
	public static void main(int[] args) {
		for (int i : args) {
			System.out.println(i);
		}
	}
}
