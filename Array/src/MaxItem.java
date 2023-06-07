import java.util.ArrayList;
import java.util.Arrays;


public class MaxItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,23,9,18};
//		System.out.println(max(arr));
		System.out.println(maxRange(arr,0,3));  // it is the range of 0 to 3 in the array 
	}

	// imagine that arr is not empty
	
//	 static int max(int[] arr) {
//		// TODO Auto-generated method stub
//		int maxVal = arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>maxVal)
//			{
//				maxVal=arr[i];
//			}
//		}
//		return maxVal;
//	}
	 
	 
	 static int maxRange(int[] arr, int start, int end) {
		 
			// TODO Auto-generated method stub
			int maxVal = arr[start];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>maxVal)
				{
					maxVal=arr[i];
				}
			}
			return maxVal;
		}

}
