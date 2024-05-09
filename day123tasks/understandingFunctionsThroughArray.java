package day123tasks;
//sum of element in an array
public class understandingFunctionsThroughArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int len = arr.length;
		System.out.println("Sum of array " + SumArray(arr, len-1));
	}

	static int SumArray(int[] arr, int len) {
		if (len == -1) 			
			return 0;
		return arr[len] + SumArray(arr, len-1);
	}
}
