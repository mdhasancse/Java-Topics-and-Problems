package searchingTech;

 // leetcode-> https://leetcode.com/problems/find-numbers-with-even-number-of-digits/#:~:text=Find%20Numbers%20with%20Even%20Number%20of%20Digits%20%2D%20LeetCode&text=Given%20an%20array%20nums%20of,(even%20number%20of%20digits).
public class EvenDigit {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		
//		System.out.println(findNumbers(nums)); // check even items in array
		System.out.println(digits(26545)); // count digits

	}
	static int findNumbers(int[] nums) {
        int count=0;
        for (int num : nums) // num in nums
        {
        	if(even(num))
        	{
        		count++;
        	}
        }
        return count;
        
    }
	
	// fuction to check whether a number contain even digit or not
	static boolean even(int num)
	{
		int numberOfDigits = digits(num);
			if(numberOfDigits % 2==0)
			{
				return true;
			}
		return false;
	}
	
	// count number of digit in a number
	static int digits(int num)
	{
		int count = 0;
		while(num > 0)
		{
			count++;
			num=num/10; //num/=10
		}
		return count;
	}
}
