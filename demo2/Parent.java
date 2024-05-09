package demo2;

class Parent {
	private int parentData;
	
	//Superclass constructor
	public Parent (int parentData) {
		this.parentData=parentData;
	}
	
	public void displayParentData() {
		System.out.println("Parent Data: " + parentData);
	}
}
