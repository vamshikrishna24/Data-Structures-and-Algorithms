import java.util.Arrays;

public class Stack {
    private int[] items = new int[5];
    private int count;

    public void push(int item) {
        if (count == items.length)
            throw new StackOverflowError(); // over flowing
        items[count++] = item;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException(); // we cannot perform the below operation for the current state of the
                                               // object
        return items[--count];
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException(); // we cannot perform the below operations for the current state of the
                                               // object
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override // this tell the java compiler that we are overriding the method inherited in
              // the base class
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
