
public class BinarySrch {

	public static void main(String[] args) {
		
		int[] arr = {-20,-15,-6,2,5,7,9,12,24,36,57,69};
		int target = 24;
		System.out.println(binarySearch(arr,target));
	}
	
	// return the index
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		while(start < end)
		{
//			int mid = (start+end)/2; // might be possible that (start+end) exceds the range of integer int. in java
			
			int mid = start+(end-start)/2;
			if(target < arr[mid])
			{
				start = mid - 1;
			}
			else if(target > arr[mid])
			{
				start=mid+1;
			}
			else
			{
				return mid;
			}
		}
			return -1;
	}
	
	
	
	
}
