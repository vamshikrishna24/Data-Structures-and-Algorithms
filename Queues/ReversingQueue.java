
import java.util.*;

class ReversingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        reverse(queue);
    }

    public static void reverse(Queue<Integer> queue) {
        Queue<Integer> reverse = new ArrayDeque<>();
        Stack<Integer> stk = new Stack<>();
        while (!queue.isEmpty()) {
            stk.add(queue.remove());
        }

        while (!stk.isEmpty()) {
            reverse.add(stk.pop());
        }

        System.out.println(reverse);

    }
}