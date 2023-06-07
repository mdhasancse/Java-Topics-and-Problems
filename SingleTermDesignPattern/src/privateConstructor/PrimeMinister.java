package privateConstructor;

public class PrimeMinister {
	String name;
	int tenure;
	String party;
	static PrimeMinister ref=null;
	private PrimeMinister(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	void work()
	{
		System.out.println("prime minister "+name+" is working day and night for the country ");
	}
	void resign()
	{
		System.out.println("prime minister "+name+" is resigning today");
	}
	
	static PrimeMinister getInstance(String name)
	{
		if(ref==null)
		{
			ref=new PrimeMinister(name);
			return ref;
		}
		return ref;
	}
	
}