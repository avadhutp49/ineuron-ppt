package assignments01;
import java.util.Iterator;

public class ArrayRepresentingInteger_04 {
	
	public static int getArrayNumber(int[] arr){
		
		int ans = 0;
		int j= arr.length-1;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"\t"+Math.pow(10, j));
			ans+=arr[i]*Math.pow(10, j);
			j--;
		}

		return (ans+1);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(getArrayNumber(arr));;
		
	}
}
