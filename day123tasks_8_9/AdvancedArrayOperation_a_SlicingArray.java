package day123tasks_8_9;
//sliced Array..
import java.util.Arrays;
public class AdvancedArrayOperation_a_SlicingArray {
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 9, 8, 7 };
		System.out.println(Arrays.toString(slicedArray(arr, 0, arr.length)));
	}

	private static int[] slicedArray(int[] arr, int startIndex, int endIndex) {
		int[] arr2 = new int[endIndex - startIndex];
		for (int i = startIndex, j = 0; i < endIndex; i++, j++) {
			arr2[j] = arr[i];
		}
		return arr2;
	}
}