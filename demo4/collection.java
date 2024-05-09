package demo4;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class collection {
	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("one");
		list1.add("two");
		list1.add("three");
		list1.add("four");
		list1.add(null);
		list1.add("one");
		
		System.out.println("Traverse element using for loop");
		for(int i=0;i<5;i++) {
			System.out.println(list1.get(i));
		}
		
		ArrayList<String> list2=new ArrayList<>(list1);
		
		for(int i=0;i<5;i++) {
			System.out.println(list2.get(i));
		}
		
		for(String num:list1) {
			System.out.println(num);
		}
		
		System.out.println("traverse element using iterator");
		Iterator<String> iterate=list1.iterator();
		
		while(iterate.hasNext()) {
			System.out.println("the element is : "+ iterate.next());
		}
		
		
		//approach 4 to reverse the collection elements...
		System.out.println("traverse element using ListIterator");
		ListIterator<String> literat=list1.listIterator();
		
		while(literat.hasNext()) {
			System.out.println(" the next element is: " + literat.next());
		}
		
		while(literat.hasPrevious()) {
			System.out.println("the previous element is : "+literat.previous());
		}
		
	}
}
