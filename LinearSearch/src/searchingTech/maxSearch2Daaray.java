package searchingTech;

public class maxSearch2Daaray {
	public static void main(String[] args) {
		int[][] arr = {
				{1,21,33},
				{14,24,35,66},
				{22,32,28,65,41},
				{54,33}
				};
		System.out.println(max(arr));
	}
	
	
	static int max(int[][] arr) {
			int maxV = arr[0][0];
			for(int row=0;row<arr.length;row++)
			{
				for(int col=0;col<arr[row].length;col++)
				{
					if(arr[row][col] >  maxV)
					{
						maxV = arr[row][col];
					}
				}
			}
			return maxV;
				
			
		}
}
