package demo1;
import java.util.Scanner;

public class bmi {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter weight in kg: ");
		double w=sc.nextDouble();
		
		System.out.println("enter height in meters: ");
		double h=sc.nextDouble();
		
		double bmi= calBMI(w,h);
		
		String bmicat;
		if(bmi<18.5) {
			bmicat="underweight";
		}
		else if(bmi>=18.5 && bmi<25) {
			bmicat="normal";
		}
		else if(bmi>=25 && bmi<30) {
			bmicat="overweight";
		}else {
			bmicat="obese";
		}
		
		System.out.println("your bmi : " + bmi);
		System.out.println("BMI cat: " + bmicat);
	}
	
	public static double calBMI(double w, double h) {
		return w/(h*h);
		
	}
	
}
