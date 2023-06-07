package firstJava;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int ans = 0;
		
		while(num>0)
		{
			int rem = num%10;
			num/=10;
			ans = ans*10+rem;
		}
		
		System.out.println(ans);
	}

}
