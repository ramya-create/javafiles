package demo;

import java.util.Scanner;

public class Task2EmployeeSalary {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] names=new String[3];
		double[] salaries=new double[3];
		System.out.println("Enter 3 Employee Details...");
		for(int i=0;i<3;i++) {
			System.out.println("Enter " + (i+1)  + "st Employee Detail...");
			System.out.println("Name: ");
			names[i]=scan.nextLine();
			System.out.println("Salary: ");
			salaries[i]=scan.nextDouble();
			scan.nextLine();
		}
		System.out.println("\nEmployee details.... ");
		for(int i=0;i<3;i++) {
			System.out.println("Name: " + names[i] +  ", Salary: " + salaries[i]);
		}
		
		double totalsalary=0;
		for(int i=0;i<3;i++) {
			totalsalary=totalsalary+salaries[i];
		}
		System.out.println("\n Total salary: " + totalsalary);
	}

}
