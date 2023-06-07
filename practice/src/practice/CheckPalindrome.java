package practice;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string to check palindrome");
		String str = sc.nextLine();
		int n = str.length();
		char[] ch = str.toCharArray();
		int i=0;
		int j=n-1;
		while(i<=j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		//all char storing in newStr after swaped
		String newStr = String.valueOf(ch);
		// checking new string and old string
		if(newStr.equals(str)) {
			System.out.println("String is Palindrom");
		}else {
			System.out.println("String is not a Palindrom");
		}
	}
	

}
