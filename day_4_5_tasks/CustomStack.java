package day_4_5_tasks;
import java.util.ArrayList;
public class CustomStack {
    private ArrayList<Integer> stack;

    public CustomStack() {
        stack = new ArrayList<>();
    }

    // Push operation
    public void push(int item) {
        stack.add(item);
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return stack.get(stack.size() - 1);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        // Push integers onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop and display items until the stack is empty
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}