import java.util.Arrays;

public class ChangeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 44, 6};
		change(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void change(int[] nums) {
		// TODO Auto-generated method stub
		nums[0] = 99; // if you make a change to the object via this ref. variable, same object will be changed
		
	}

}
