package assignments01;

public class SumOfArrayElementEqualsTarget_01 {
    
	public static int[] findTargetSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1}; // if no elements found
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 2,15};
        int target = 9;
        int[] result = findTargetSum(arr, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}