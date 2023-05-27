package assignments01;
import java.util.Arrays;

public class MoveAllZeros7 {

	public static void moveAllZerosToEnd(int[] nums) {
        int i = 0; 
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

	public static void main(String[] args) {
		int[] arr= {0,1,0,3,12};
		System.out.println(Arrays.toString(arr));;
		moveAllZerosToEnd(arr);
		System.out.println(Arrays.toString(arr));;
	}
	
}
