package demo5;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMap {
	public static void main(String[] args) {
		Map<Integer, EmployeeDetails> lm=new HashMap<>();
		
		EmployeeDetails emp1=new EmployeeDetails(101, "Ramya", 25000);
		EmployeeDetails emp2=new EmployeeDetails(102, "Siddhu", 30000);
		EmployeeDetails emp3=new EmployeeDetails(103, "Roodh", 35000);
		
		lm.put(101,emp1);
		lm.put(102,emp2);
		lm.put(103,emp3);
		
		
		Set<Entry<Integer, EmployeeDetails>> s=lm.entrySet();
		for(Entry<Integer, EmployeeDetails> entry:s) {
			System.out.println(entry.getKey()+":");
			System.out.println(entry.getValue());
		}
		
	}
	
	
	public static void dis
}
