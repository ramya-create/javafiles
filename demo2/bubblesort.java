package demo2;

public class bubblesort {
	public static void main(String[] args) {
		int num[]= {67,34,12,89,56};
		int temp=0;
		for(int i=0;i<num.length-1;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
}
