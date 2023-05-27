package assignments01;

public class ArrayDuplicates_06 {
	
	public static boolean arrayDuplicates(int[] arr){
		
		int index = 0;
		for (int i = index+1; i < arr.length; i++) {
			if(arr[index]==arr[i])
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1};
		System.out.println(arrayDuplicates(arr));
	}
}
