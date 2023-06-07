package rotateArr;

import java.util.Scanner;

public class LeftRotaion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter the array of elements");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the K position for left rotation: ");
		int k = sc.nextInt();
		
		rotate(arr,k,n);
		System.out.print("After "+ k+ " Times left rotation Array is :");
		printArr(arr, n);
		
		
	}
	
	static void rotate(int[] arr, int k, int n) {
		int[] temp = new int[n];
		int j=0;
		for(int i=k;i<n;i++) {
			temp[j] = arr[i];
			j++;
		}
		for(int i=0;i<k;i++)
		{
			temp[j] = arr[i];
			j++;
		}
		
		for(int i=0;i<n;i++)
		{
			arr[i] = temp[i];
		}
	}
	static void printArr(int arr[],int n) {
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
