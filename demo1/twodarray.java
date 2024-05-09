package demo1;
import java.util.Scanner;
public class twodarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] array=new int[3][3];
		System.out.println("Enter elements: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Enter array["+i+"]["+j+"]"); 
				array[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(array[i][j]);
			}
			System.out.println("\n");
		}
		//minimum
		int min=array[0][0];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(array[i][j]<min) {
					min=array[i][j];
				}
			}
		}
		System.out.println("Minimum: " + min);
		//transpose
		//int transpose[3][3];
		int[][] transpose=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transpose[j][i]=array[i][j];
			}
		}
		System.out.println("Transpose matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(transpose[i][j]);
			}
		}
		// adding diagonals
		int sum=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					sum=sum+array[i][j];
				}
			}
		}
		System.out.println("sum of diagonal: " + sum);
		
	}

}
