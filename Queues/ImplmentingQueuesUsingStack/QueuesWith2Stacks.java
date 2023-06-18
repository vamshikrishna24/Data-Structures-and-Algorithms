import java.util.Stack;

public class QueuesWith2Stacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        stack1.push(item);
    }

    // while dequeueing, we remove all items from stack1 and add them to stack2
    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack2();
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();
        moveStack1ToStack2();
        return stack2.peek();
    }

    // notice that we are reusing this method (refactored the code)
    private void moveStack1ToStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

}
