package day_4_5_tasks;
public class Rectangle extends Shape{
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width*height;
	}
}