package demo2;
import java.util.Arrays;
public class arrayslicedemo {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println("array: " + Arrays.toString(a));
		int firstindex=2, lastindex=4;
		
		int[] arraySlice = new int[lastindex - firstindex];
		for(int i=0;i<arraySlice.length;i++) {
			arraySlice[i]=a[firstindex + i];
		}
		System.out.println("Sliced Array: " + Arrays.toString(arraySlice));
	}
}
