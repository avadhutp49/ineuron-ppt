package assignments01;
import java.util.Arrays;
public class ErrorArray {
	public static int[] findDuplicate(int[] nums) {
        int n = nums.length;
        int[] arr= new int[2];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    arr[0]=nums[i];
                    arr[1]=nums[i]+1;
                }
            }
        }
        return arr;
    }
	
	public static void main(String[] args) {
		int[] arr= {1,2,2,4};
		System.out.println(Arrays.toString(findDuplicate(arr)));;

	}
}