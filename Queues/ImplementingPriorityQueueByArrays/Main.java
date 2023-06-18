public class Main {

    public static void main(String[] args) {
        PriorityQueueByArray queue = new PriorityQueueByArray();
        queue.add(2);
        queue.add(1);
        queue.add(6);
        queue.add(5);
        queue.add(1);

        System.out.println(queue.toString());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

    }
}