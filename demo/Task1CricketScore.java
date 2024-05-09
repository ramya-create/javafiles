package demo;

import java.util.Scanner;

public class Task1CricketScore {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[10];
		System.out.println("Enter the scores..");
		for(int i=0;i<10;i++) {
			a[i]=scan.nextInt();
		} 
		int sum=0;
		for(int i=0;i<10;i++) {
			sum=sum+a[i];
		}
		int avg;
		avg=sum/10;
		System.out.println("Average score of 10 matches: " + avg);
	}

}
