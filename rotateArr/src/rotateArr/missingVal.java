package rotateArr;

public class missingVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,4};
		int n = arr.length;
		int sum = (n+1)*(n+2)/2;
		
		for(int i=0;i<n;i++) {
			sum-=arr[i];
		}
		System.out.println(sum);
	}

}
