package demo4;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
}

public class useEmployeeCollection {
	public static void main(String[] args) {
		ArrayList<Employee> employee=new ArrayList<>();
		
		employee.add(new Employee(01, "Ramya", 35000));
		employee.add(new Employee(02, "Siddhu", 40000));
		employee.add(new Employee(03, "Roodh", 31000));
		
		System.out.println("Detaisl of employees...");
		Iterator<Employee> iterator=employee.iterator();
		while(iterator.hasNext()) {
			Employee emp=iterator.next();
			System.out.println("id: " + emp.getId() + ", name: " + emp.getName() + ", salary: " + emp.getSalary());
		}
		
		
	}
}
