package OverLoading;

	
public class Fan {
	// Constructor and Super() Example-->
		int no_of_wings;
		String brand;
		String color;	
		
		public Fan() {
			
			this("Blue","Usha",4);
			
		}
		
		public Fan(int a)
		{
			super();
			no_of_wings=a;
		}
		
		public Fan(int a , String b)
		{
			
			this("Bajaj",5);
			no_of_wings=a;
			color=b;
		}
		
		public Fan(String a,int b)
		{
			super();
			brand=a;
			no_of_wings=b;
		}
		public Fan(int a,String b,String c)
		{
			super();
			no_of_wings=a;
			brand=b;
			color=c;
		}
		
		public Fan(String x,String y,int z)
		{
			super();
			color=x;
			brand=y;
			no_of_wings=z;
			
		}
		
		public Fan(String a,int b,String c)
		{
			super();
		}
	


	public static void main(String[] args) {
		Fan fan=new Fan();
		System.out.println(fan.no_of_wings+" "+fan.brand+" "+fan.color);

		
		Fan fan1=new Fan(5,"Grey");
		System.out.println(fan1.no_of_wings+" "+fan1.brand+" "+fan1.color);
		
		
	}

}


