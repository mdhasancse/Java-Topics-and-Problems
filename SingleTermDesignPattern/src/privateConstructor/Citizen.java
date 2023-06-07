package privateConstructor;

public class Citizen 
{
	public static void main(String[] args) 
	{
		PrimeMinister pm=PrimeMinister.getInstance("MODI");
		pm.work();
		pm.resign();
		PrimeMinister pm2=PrimeMinister.getInstance("YOGI");
		pm2.work();
		pm2.resign();
	}
}
