package day123tasks_8_9;

public class StringOperation {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "wipro";
        int length = 4;
        System.out.println(middleSubstringFormation(str1, str2, length));
        String str3 = "";
        String str4 = "test";
        int length2 = 3;
        System.out.println(middleSubstringFormation(str3, str4, length2));
        String str5 = "hai";
        String str6 = "test";
        int length3 = 5;
        System.out.println(middleSubstringFormation(str5, str6, length3));
    }
    private static String middleSubstringFormation(String str1, String str2, int length) { 
    	String concatenated = str1.concat(str2);
    	StringBuilder reversed = new StringBuilder(concatenated).reverse();
    	int middleIndex = reversed.length() / 2;
    	int startIndex = middleIndex - length / 2;
    	int endIndex = startIndex + length;
    	if (reversed.length() == 0 || length > reversed.length()) {
    		return "Enter valid string";
    	}
    	String middleSubstring = reversed.substring(startIndex, endIndex);
    	return middleSubstring;
    }
}
