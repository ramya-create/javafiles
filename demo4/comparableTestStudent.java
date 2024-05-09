package demo4;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
public class comparableTestStudent {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101, "Ramya", 80));
		al.add(new Student(102, "siddhu", 90));
		al.add(new Student(103, "Roodh", 70));
		
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		
		System.out.println("Sorting by name..");
		
		Collections.sort(al,new NameComparator());
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		System.out.println("sorting by age");
		
		Collections.sort(al,new AgeComparator());
		Iterator itr2=al.iterator();
		while(itr2.hasNext()) {
			Student st=(Student)itr2.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		
	}
}
