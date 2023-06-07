package searchingTech;
import java.util.Scanner;
import java.util.Arrays;

public class LinearSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,-5,6,12,8,44,32};
		int target = 12;
		int ans = linearSearch(nums,target);
		System.out.println(ans);
		
	}
	
	static int linearSearch(int[] arr, int target)
	{
		if(arr.length==0)
		{
			return -1;
		}
		for (int index=0; index<arr.length; index++)
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
