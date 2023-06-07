package encapsulation;

public class Account {
	private long acc_no;
	private String name,email;  
	private float amount;  
	
	public long getAcc_no()
	{
		return acc_no;
	}
	public long setAcc_no(long acc_no)
	{
		return this.acc_no = acc_no;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String setName(String name)
	{
		return this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	public String setEmail(String email)
	{
		return this.email = email;
	}
	
	public float getAmount()
	{
		return amount;
	}
	public float setAmount(float amount)
	{
		return this.amount = amount;
	}






	public static void main(String[] args)
	{
		Account account = new Account();
		
		account.setAcc_no(128022356);
		account.setName("Toy");
		account.setEmail("toy@gmail.com");
		account.setAmount(20000f);
		
		System.out.println(account.getAcc_no()+" "+account.getName()+" "+account.getEmail()
		+" "+account.getAmount());
	}
}


