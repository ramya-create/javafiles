package com.emp;

import static java.lang.Math.*;

public class Employee {
	
	//static variable / property
	static String company="wipro";
	//no static var..
	int x=1;
	
	static int no=100;
	
	static void display() {
		System.out.println("company: " + Employee.company);
	}
	
	
	
	//instance var...
	private int id;
	private String ename;
	private double salary;
	// no constructor- default constru
	public Employee(String Ename, float Salary) {  // no arg constr
		super();
		//automatically generate the id of emp
		this.id=no++;
		ename=Ename;
		salary=Salary;
	}
	
	public void newShowData() {
		System.out.println(id + " : " + ename + " : " + salary);
	}
	
	public Employee(int id, String ename, double salary) {
		super();
		this.id=id;
		this.ename=ename;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [id-" + id + ", ename-" + ename + ", salary=" + salary + "]";
		
	}

}
