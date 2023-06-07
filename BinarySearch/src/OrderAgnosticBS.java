
public class OrderAgnosticBS {

	public static void main(String[] args) {
		
//		int[] arr = {-20,-15,-6,2,5,7,9,12,24,36,57,69};
		int[] arr = {99,88,44,66,33,11};
		
		int target = 44;
		System.out.println(OrderAgnosticBS(arr,target));
	}
	
	
	
	static int OrderAgnosticBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		// find whether the array is sorted in ascending or descending
		boolean isAsc;
		if(arr[start] < arr[end])
		{
			isAsc = true;
		}else {
			isAsc = false;
		}
		
		
		while(start < end)
		{
//			int mid = (start+end)/2; // might be possible that (start+end) exceds the range of integer int. in java
			
			int mid = start+(end-start)/2;
			
			if(arr[mid]==target)
			{
				return mid;
			}
			if(isAsc)
			{
				if(target < arr[mid])
				{
					start = mid - 1;
				}
				else 
				{
					start=mid+1;
				}
			}
				else
				{
					if(target > arr[mid])
					{
						start = mid - 1;
					}
					else 
					{
						start=mid+1;
					}
				}
			}
			
			
		
			return -1;
	}
	
}
