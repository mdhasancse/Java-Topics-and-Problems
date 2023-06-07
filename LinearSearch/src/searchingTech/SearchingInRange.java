package searchingTech;

public class SearchingInRange {

	public static void main(String[] args) {
		
		int[] nums = {2,3,-5,6,12,8,44,32};
		int target = 6;
		int ans = linearSearch(nums,target,1,5);
		System.out.println(ans);

	}
	static int linearSearch(int[] arr, int target, int start, int end)
	{
		if(arr.length==0)
		{
			return -1;
		}
		for (int index=start; index <= end; index++)
		{
			int element = arr[index];
			if (element == target)
				return index;
		}
		// this line will execute if none of the return statments above have executed
		// hence the target not found
		return -1;
	}

}
