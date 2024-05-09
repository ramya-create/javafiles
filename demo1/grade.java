package demo1;
import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Score: ");
		int score=sc.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("enter score within 0 to 100");
			
		}
		else {
			char g;
			if(score>=90 && score <=100) {
				g='A';
			}
			else if(score>=80 && score <=89) {
				g='B';
			}
			else if(score>=70 && score<=79){
				g='C';
			}
			else if(score>=60 && score>=69) {
				g='D';
			}
			else {
				g='F';
			}
			System.out.println("grade : " + g);
		}
	}
}
