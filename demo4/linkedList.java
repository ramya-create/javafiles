package demo4;
import java.util.LinkedList;
public class linkedList {
	public static void main(String[] args) {
		//creating object of the class linked list
		LinkedList<String> ll=new LinkedList<String>();
		
		//adding elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");
		
		System.out.println(ll);
		
		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
	}
}
