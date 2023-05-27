package assignments01;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class RemoveTargetElements_02 {
	
	private static void reverseArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++; end--;
        }
	}
	
	public static int[] removeAllOccurances(int[] arr, int target){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target)
				arr[i]=-1;
		}
		
		Arrays.sort(arr);
		reverseArr(arr);
		return arr;
	}
	  
	public static void main(String[] args) {
		int[] arr = {3,2,2,3};
		int target=3;
		System.out.println(Arrays.toString(removeAllOccurances(arr,target)));;
	}
}
