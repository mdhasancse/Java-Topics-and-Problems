import java.lang.reflect.Array;
import java.util.Arrays;

public class PassinginFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,5,7,88};
		System.out.println(Arrays.toString(nums));
		change(nums);
		System.out.println(Arrays.toString(nums));
		
	}

	private static void change(int[] arr) {
		// TODO Auto-generated method stub
		arr[0] = 99;
		
	}

}
