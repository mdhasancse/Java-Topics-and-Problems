package loops;

public class armstrongNo {
	public static void main(String[] args)
	{
		int n=153;
		int temp, digits=0, rem=0, sum=0;  
		temp=n;
		while(temp>0)    
		{   
		temp = temp/10;    
		digits++;   
		}   
		temp = n;   
		while(temp>0)   
		{       
		rem = temp % 10;
		sum +=  (Math.pow(rem, digits));
		temp = temp/10;   
		}
		
		if(n==sum)
		{
			System.out.println("Number is Arm");
		}else {
			System.out.println("Number is not arm");
		}
	}	
}
