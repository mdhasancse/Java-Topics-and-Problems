import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		boolean ans = isPrime(n);
//		System.out.println((ans));
		
//		System.out.println(isArmStrong(n));
		// all 3 digit armstrong number print
		for (int i=100;i<1000;i++)
		{
			if (isArmStrong(i))
			{
				System.out.println("The armstrong 3 digit numbrs is " +i+ " ");
			}
		}
	}
	
	
	// Print all three digit armStrong Number  eg.153--> 1+125+27 = 252
	static boolean isArmStrong(int n) {
		// TODO Auto-generated method stub
		int original = n;
		int sum = 0;
		while(n > 0) {
			int rem = n%10;
			n = n/10;
			sum = sum+rem*rem*rem;
		}
		if (sum == original)
		{
			return true;
		}
		return false;
		
	}


	
	
	
	static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if (n<=1) {
			return false;
		}
		int c = 2;
		while(c*c <= n)
		{
			if (n%c == 0)
			{
				return false;
			}
			c++;
		}
		if (c*c > n)
		{
			return true;
		}
		return false;
		
	}

}
