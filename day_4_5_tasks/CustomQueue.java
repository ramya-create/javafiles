package day_4_5_tasks;
import java.util.ArrayList;

public class CustomQueue<T> {
    private ArrayList<T> queue;

    public CustomQueue() {
        queue = new ArrayList<>();
    }

    // Enqueue operation
    public void enqueue(T item) {
        queue.add(item);
    }

    // Dequeue operation
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        return queue.remove(0);
    }

    // Peek operation
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek.");
        }
        return queue.get(0);
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        CustomQueue<Object> queue = new CustomQueue<>();

        // Enqueue strings and integers onto the queue
        queue.enqueue("First");
        queue.enqueue(2);
        queue.enqueue("Third");
        queue.enqueue(4);

        // Dequeue and display items to confirm FIFO order
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}