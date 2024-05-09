package day_4_5_tasks;

public class Circle extends Shape{
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
}
