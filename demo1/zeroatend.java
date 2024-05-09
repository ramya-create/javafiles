package demo1;
import java.util.Scanner;
public class zeroatend {
	public static void main(String[] args) {
		int[] a=new int[8];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i=0;i<8;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<8;i++) {
			if(a[i]>0) {
				System.out.println(a[i]);
			}
		}
		for(int i=0;i<8;i++) {
			if(a[i]==0) {
				System.out.println(a[i]);
			}
		}
		
	}
}
