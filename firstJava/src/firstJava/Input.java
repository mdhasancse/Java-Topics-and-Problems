package firstJava;

import java.util.Scanner;
public class Input {
    static void diagonal(int[][] matrix,int N)
    {
        int first_d = 0, sec_d=0;
        for(int i=0;i<=matrix.length-1;i++)
        {
            for(int j=0;j<=matrix.length-1;j++){
                if(i==j)
                	first_d+=matrix[i][j];

                if((i+j)==(N-1))
                	sec_d+=matrix[i][j];
            }
        }
        int Total_sum=first_d+sec_d;
        System.out.println("sum of diagonal are "+Total_sum);
    }
    static public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the array length");
        int n=scan.nextInt();
        System.out.println("enter matrix element");
        int arr1[][] = new int[n][n];
        for(int i=0; i<=arr1.length-1;i++){
            for(int j=0; j<=arr1[i].length-1;j++){
                arr1[i][j] = scan.nextInt();
            }
        }
        System.out.println("matrix element are: ");
        for(int i=0; i<=arr1.length-1;i++) {
        	for(int j=0; j<=arr1[i].length-1;j++)
        	{
        		System.out.println(arr1[i][j]+" ");
        	}
        	System.out.println();
        }
         diagonal(arr1,n);
        
        
    }
}
