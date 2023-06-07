// Func. Overloading happen when two or more fun. have same name
// it has been in compile time only
public class FucOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(67);
		fun("Md Hasan");
		
		int ans = sum(3,4);
		System.out.println(ans);
		
		int res = sum(3,4,5);
		System.out.println(res);
	}

	

	static void fun(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
		
	}

	static void fun(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
	
	
	static int sum(int i, int j) {
		return i+j;
	}
	
	static int sum(int i, int j, int k) {
		return i+j+k;
	}

	
}
