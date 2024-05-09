package demo3;

public class stringDemo {
	public static void main(String[] args) {
		String s="Alex";	//constant pool
		s.concat("Martin");	//concat() method appends the string at the end
		System.out.println(s.concat("Martin"));
		System.out.println(s);	//will print Alex because strings are immutable objects.
		
		Object O1;
		//---- string comparision--- equals---
		//compare this string to the specified object..
		String s1="Apples";
		String s2="Apples";
		String s3=new String ("Apples");
		String s4="Saurav";
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true..
		System.out.println(s1.equals(s4));//false
		
		
		System.out.println(s1==s2); //true becoz both refer to same instance.
		System.out.println(s1==s3); // false becoz s3 refers to instance created in nonpool
		
		//----compareTo----
		String s10="Max";
		String s20="Max";
		String s30=new String("Alex");
		System.out.println(s10.compareTo(s20));//0
		System.out.println(s10.compareTo(s30));//12 becoz s10>s30
		System.out.println(s30.compareTo(s10));//-12 becoz s3<s1
		}
}
