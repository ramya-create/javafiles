package demo1;

public class loops {
	public static void main(String[] arg) {
		int[] numbers= {1,2,3,4,5};
		for(int number : numbers) {
			System.out.println(number + " ");
		}
		String[] fruits= {"apple","orange", "banana"};
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for(char vowel : vowels) {
			System.out.println(vowel);
		}
		
		int n=3;
		int[] num= {10,20,30};
		for(int i=0;i<n;i++) {
			System.out.println(num[i]);
		}
		
		while(n<0) {
			int j=0;
			System.out.println(num[j]);
			j++;
			n--;
		}
	/**	int k=1;
		do {
			System.out.println(k);
			k++;
		}while(k<=5);
		**/
	}
}
