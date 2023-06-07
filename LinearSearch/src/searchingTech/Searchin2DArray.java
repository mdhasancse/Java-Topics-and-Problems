package searchingTech;

import java.util.Arrays;

public class Searchin2DArray {

	public static void main(String[] args) {
		int[][] arr = {
						{1,21,33},
						{14,24,35,66},
						{22,32,28,65,41},
						{54,33}
						};
		int target= 65;
		int[] ans = search(arr,target); // formate of return value{row, col}
		System.out.println(Arrays.toString(ans));

}

	static int[] search(int[][] arr, int target) {
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				if(arr[row][col]==target)
				{
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1-1};
			
		
	}
}
