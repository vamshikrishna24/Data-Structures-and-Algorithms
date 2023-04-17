//this is just an example implementation of queues using arrays
class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Dequeue();
        queue.Enqueue(40);
        queue.Enqueue(50);
        queue.Enqueue(60);
        System.out.println(queue.peek());

        System.out.println(queue.toString());
    }
}