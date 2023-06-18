public class Main {
    public static void main(String[] args) {
        QueuesWith2Stacks queue = new QueuesWith2Stacks();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();
        int pop = queue.dequeue();
        System.out.println(pop);
    }
}