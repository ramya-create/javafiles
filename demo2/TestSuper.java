package demo2;

class Child extends Parent{
	private int childData;
	

	
	
	//Subclass constructor
	public Child(int parentData, int childData) {
		//call supercalss constructor using super()
		super(parentData);
		this.childData=childData;
	}
	
	public void displayChildData() {
		System.out.println("Child Data: " + childData);
	}
}




 class Child1 extends Child{
	private int childData1;
	
	//Subclass constructor
	public Child1(int childData, int childData1) {
		//call supercalss constructor using super()
		super(childData, childData1);
		this.childData1=childData1;
		//System.out.println("child1 class");
	}
	
	public void displayChildData1() {
		System.out.println("child1 data: " + childData1);
	}
}










public class TestSuper {
	public static void main(String[] args) {
		//create a child object
		Child child=new Child(10,20);
		
		//display parent and child data
		child.displayParentData(); // access parent class method
		child.displayChildData();  //  access child class method
		
		Child1 child1=new Child1(30,40);
		child1.displayChildData1();
	}
}
