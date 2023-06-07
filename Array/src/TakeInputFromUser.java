import java.util.Scanner;

public class TakeInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array length");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			for(int j=0; j<=arr[i].length-1;j++)
			{
				System.out.println("enter matrix element");
				arr[i][j] =  sc.nextInt();
				
			}
		}
		System.out.println("matrix element are: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
