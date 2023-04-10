import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        System.out.println(list.KthNodeFromEnd(3));
        System.out.println(Arrays.toString(list.toArray()));
    }
}