package assignments01;

public class FindTarget_03 {
	
	public static int findTarget(int[] arr, int target){
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]== target)
				return i;
		}
		
		int i = 0;
		try {
			while(arr[i]<target) {
				i++;	
			}
		} catch (Exception e) {
			return arr.length;
		}
		return i;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,5,6};
		int target=0;
		System.out.println(findTarget(arr, target));
	}
}
