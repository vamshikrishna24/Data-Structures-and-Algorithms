
//In this the queues methods are implemented by using an array
import java.util.*;

public class ArrayQueue {
    private int[] items;
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    // initializing the size of array
    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void Enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int Dequeue() {
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;

    }

    public int peek() {
        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {

        return Arrays.toString(items);
    }

}
