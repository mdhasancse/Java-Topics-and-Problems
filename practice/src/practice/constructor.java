package practice;

public class constructor {
	private String firstName;
	private String lastName;
	private Integer age;
	public constructor(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	
	}
	public String getFirstName()
	 {
		 return firstName;
	 }
	public void setFirstName(String FirstName)
	{
		this.firstName = firstName;
	}
	 
	
	 public String getlastName()
	 {
		 return lastName;
	 }
	 public void setlastName(String lastName)
		{
			this.lastName = lastName;
		}
	
	 public Integer getage()
	 {
		 return age;
	 }
	 public void setAge(Integer age)
		{
			this.age = age;
		}
	 
	 
	 public static void main(String args[])
	 {
		 constructor obj = new constructor("Alexa","Amazon",15);

		 System.out.println("Coder first Name is "+ obj.getFirstName()+" Lat Name is "+
		 obj.getlastName()+ " and age is "+obj.getage());
	 }
 
}
