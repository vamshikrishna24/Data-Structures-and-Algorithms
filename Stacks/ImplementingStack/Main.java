//note that there is no 
//import java.util.* , because we are calling the Stack that is present in this folder

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        // for now in the Stack.java we only declared it's size to be 5
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

    }
}
