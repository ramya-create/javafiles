package day123tasks;
//print the array in reverse order..
public class arrayDeclarationInitializationUsage {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println("array in reverse order: ");
		for(int i =a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
			
	}
}
