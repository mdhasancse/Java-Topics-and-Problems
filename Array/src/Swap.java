
import java.util.ArrayList;
import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,23,9,18};
//		swap(arr,1,3);
		Reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	
	static void Reverse(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start < end)
		{
			//swap
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	
	
	static void swap(int[] arr, int index1, int index2) {
		// TODO Auto-generated method stub
		int temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}

}
