
public class ColNoFixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
				{1,2,3}, //0th index
				{4,5,},  //1st index
				{6,7,8,9}  //2nd index -> arr[2]={6,7,8,9}   
				};
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
