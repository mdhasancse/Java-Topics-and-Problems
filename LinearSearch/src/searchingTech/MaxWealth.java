package searchingTech;

// llecode problem   1672. Richest Customer Wealth

public class MaxWealth {

	public static void main(String[] args) {
		

	}
	
	public int maximumWealth(int[][] accounts) {
	        
		// person=row
		// account=col
		
		int ans = Integer.MIN_VALUE;
		for (int person=0; person < accounts.length; person++)
		{
			int sum = 0;
			// when you start a new col, take a new sum for that row
			for(int account=0; account < accounts[person].length; account++)
			{
				sum += accounts[person][account]; // add all values in the row 
			}
			// now we have sum of acc. of person
			// check with overall ans.
			if (sum > ans)
			{
				ans = sum;
			}
			
		}
		return ans;
	    }
}
