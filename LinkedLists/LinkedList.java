import java.util.NoSuchElementException;



public class LinkedList {
    // this is a node (single part of linkedlist)
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    // declaring head and tail of linkedlist
    private Node head;
    private Node tail;
    private int size;

    // adding values at the start of linkedlist
    public void addFirst(int item) {
        var node = new Node(item);
        if (head == null)
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    // adding values at the end of linkedlist
    public void addLast(int item) {
        // var keyword will automatically recognise what type the varable is--
        // based on the right side initialized part
        var node = new Node(item);
        if (head == null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // finding the index of an element in the list
    public int indexOf(int item) {
        int index = 0;
        var current = head;
        while (current != null) {
            if (current.value == item)
                return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    // checking wheather the element is in list or not
    public boolean contains(int item) {
        // generally one would approach as shown below,
        // you need to understand to reuse the code parts you have written
        // var current = head;
        // while (current != null) {
        // if (current.value == item)
        // return true;
        // }
        // return false;

        return indexOf(item) != -1;

    }

    // removing the first element from the list
    public void removeFirst() { // [head] ----[tail]
                                // [10 -> 20 -> 30]
        if (head == null) // case: where there is no element
            throw new NoSuchElementException();
        if (head == tail) {// case: there is only one element
            head = tail = null;
            return;
        }
        // case: having more than one element
        var current = head.next;
        head.next = null;
        head = current;
        size--;
    }

    // removing the last element
    public void removeLast() {
        if (head == null)
            throw new NoSuchElementException();
        if (head == tail) {
            head = tail = null;
        }
        else{
            var current = getPrevious(tail);// we are reusing what we have written below
            tail = current;
            current.next = null;
        }
        size--;
    }

    // code below will give you the previous node of the sent node
    private Node getPrevious(Node node) {
        var current = head;
        while (current != null) {
            if (current.next == tail)
                return current;
            current = current.next;
        }
        return null;
    }

    //with this implementation the run time complexity is O(1)
    public int size(){
        //first approach you will think is to traverse the linked list node by node this take O(n)
        //but from the start we declared a private size variable to do the task
        return size;
    }

    //converting linked list into an array
    public int[] toArray(){
        int [] arr = new int[size];
        var current = head;
        int index=0;
        while(current!=null)
        {
            arr[index++] = current.value;
            current = current.next;
        }
        return arr;
    }

    //reversing a linked list
    //try this before seeing the soluction
    public void reverse(){
        if(head==null) return;
        var previous = head;
        var current  = head.next;
        while(current!=null)
        {
            var next = current.next;
            current.next= previous;
            previous=current;
            current=next;
        }
        tail = head;
        tail.next=null;
        head=previous;
    }

    //finding kth node from the end in one pass
    public int KthNodeFromEnd(int K)
    {
        if(head == null)
            throw new IllegalStateException();
        var current = head;
        var previous = head;
        for(int i=0;i<K-1;i++)
        {
            current=current.next;
            if(current == null) throw new IllegalArgumentException();
        }
        while(current!=tail)
        {
            current = current.next;
            previous = previous.next;
        }
        return previous.value;
     }


}
