package day123tasks;
//perform linear search..
import java.util.Scanner;
public class arraySortingsearchingPerformLinearSearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find : ");
		int number = sc.nextInt();
		int result= performLinearSearch(arr, number);
		if(result!=-1) {
			System.out.println("Element " + number + " found at index " + result);
		}
		else {
			System.out.println("Element " + number + " not found in an array");
		}
	}
	
	
	public static int performLinearSearch(int[] arr,int number) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number) {
				return i;
			}
		}
		//if element is not found, return -1...arr.
		return -1;
		
			
	}
}
