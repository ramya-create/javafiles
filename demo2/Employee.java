package demo2;

public abstract class Employee {
	final String name;
	Employee(String name){
		this.name=name;
	}
	//non abstract
	public void getCompanyName() {
		System.out.println("Wipro");
	}
	public void getCompanyName1() {
		System.out.println("Wiproooo");
	}
	//abstract method
	public abstract int getBonus();
	
}
