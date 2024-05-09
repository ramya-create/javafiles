package com.emp;

import java.util.Scanner;

public class UseEmployee {
	static {
		System.out.println("welcome to java..");
	}
	public static void main(String ... args ) {
		//Employee refObj=new Employee();
		//Employee RamyaObj=new Employee(1, "Ramya", 50000);
		
		//System.out.println("RefObject Data: "+ refObj.id + " _ " +refObj.ename+ " _ " + refObj.salary);
		//System.out.println("RamyaObject Data: "+ RamyaObj.id + " _ " +RamyaObj.ename+ " _ " + RamyaObj.salary);
		//System.out.println(RamyaObj);
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		
		System.out.println(n1*n2);
		
		final double Averagesalary=98779d;
		
		Scanner sc=new Scanner(System.in);
		
		//array
		
		Employee e[]=new Employee[3];
		//create and initialize actual employee objects using command line..
		
		e[0]=new Employee("ABC", 3455f);
		e[1]=new Employee("XYZ", 5447f);
		
		//display the employee object data..
		System.out.println("Employee object 1: " + e[0]);
		System.out.println("Employee object 2: " + e[1]);
		
		e[1].newShowData();
		int total=Employee.no;
		total=total-100;
		System.out.println("total number of employees are: " + total);
		
		Employee.display();
		/**
		int total=0;
		for(int i=0;i<3;i++) {
			System.out.println("name: ");
			String name=sc.next();
			System.out.println("id: ");
			int id=sc.nextInt();
			System.out.println("salary: ");
			int salary=sc.nextInt();
			
			e[i]=new Employee();
			e[i].setEname(name);
			e[i].setId(id);
			e[i].setSalary(salary);
			
			total=total+salary;
		}
		**/
		/**
		
		
		
		System.out.println("employees details...: ");
		for(int i=0;i<3;i++) {
			System.out.println("name: " + e[i].getEname());
			System.out.println("name: " + e[i].getId());
			System.out.println("name: " + e[i].getSalary());
			
		}
		System.out.println("total : " + total);
		**/
		
		/**
		Employee e1=new Employee(1, "Ramya", 200000);
		e1.setId(10);
		System.out.println(e1.getId());
		//e[0].id=10;
		//e[1].ename="ram";
		//e[2].salary=50000;
		/**
		for(int i=0;i<3;i++) {
			//accept tha sal from user
		}
		for(int i=0;i<3;i++) {
			//print info..
		}
		**/
	}
}
