package searchingTech;

public class minNo {

	public static void main(String[] args) {
		int[] nums = {22,25,6,12,8,44,32};
		System.out.println(min(nums));

	}
	
	
	 static int min(int[] arr) {
		int ans = arr[0]; // start search from from 1st index
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i] < ans)
			{
				ans = arr[i];
			}
			
		}
		return ans;
				
		
	}

}
