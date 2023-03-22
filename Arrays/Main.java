//this code is based on the Array.java class
public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
        numbers.print();

        System.out.println(numbers.indexOf(3));
    }
}
