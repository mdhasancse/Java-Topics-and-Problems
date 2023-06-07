package practice;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();	
		
		reverse(str);	
	}	
		static void reverse(String str) {
		int n = str.length();
		int i=0;
		int j = n-1;
		char[] ch = str.toCharArray();
		while(i<=j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
			
		}
		String revString = String.valueOf(ch);
		System.out.println(revString);
		}
}
