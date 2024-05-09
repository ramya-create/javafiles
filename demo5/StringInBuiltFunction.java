package demo5;

public class StringInBuiltFunction {
	public static void main(String[] args) {
		String s="Hello, World!";
		String str="Hello, World!";
		
		int length=str.length();
		System.out.println("length of a string: " + length);
		
		char charindex=str.charAt(5);
		System.out.println("Character at index at: " + charindex);
		
		String substringFromIndex7=str.substring(7);
		System.out.println("sunstring from index 7: " + substringFromIndex7);
		
	}
}
