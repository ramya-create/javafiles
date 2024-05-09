package math.operation;

public class ArithmeticOperation {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Addition: " + addition.add(a, b));
		System.out.println("Subtraction: " + subtraction.subtract(a, b));
		System.out.println("Multiplication: " + multiplication.multiply(a, b));
		System.out.println("division: " + division.divide(a, b));
		try {
			System.out.println("division: " + division.divide(a, b));
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
}
