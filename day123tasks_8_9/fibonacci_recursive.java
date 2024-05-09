package day123tasks_8_9;
import java.util.ArrayList;
import java.util.Arrays;
public class fibonacci_recursive {

	public static int fibonacci(int n, ArrayList<Integer> fibonacciArray) {
		if (n < fibonacciArray.size()) {
			return fibonacciArray.get(n);
		} else {
			int fibNum = fibonacci(n - 1, fibonacciArray) + fibonacci(n - 2, fibonacciArray);
			fibonacciArray.add(fibNum);
			return fibNum;
		}
	}

	public static ArrayList<Integer> fibonacciSequence(int n) {
		ArrayList<Integer> fibonacciArray = new ArrayList<>();
		fibonacciArray.add(0);
		fibonacciArray.add(1);
		for (int i = 2; i < n; i++) {
			fibonacci(i, fibonacciArray);
		}
		return fibonacciArray;
	}

	public static void main(String[] args) {
		int n = 10;
		ArrayList<Integer> fibonacciElements = fibonacciSequence(n);
		System.out.println("The first elements of sequence are: " + fibonacciElements);
		System.out.println("The " + n + "th element of the Fibonacci sequence is: "
				+ fibonacci(n - 1, new ArrayList<>(Arrays.asList(0, 1))));
	}
}