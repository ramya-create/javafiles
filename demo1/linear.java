package demo1;

import java.util.Scanner;

public class linear {
	public static void main(String[] args) {
		System.out.println("enter array size: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("enter element that u want to search in an array");
		int element=sc.nextInt();
		int count=0;
		for(int i=0;i<size;i++) {
			if(array[i]==element) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("elementpresent in an array");
		}
		else {
			System.out.println("element not present in an array");
		}
	}
}
