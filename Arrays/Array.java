//this is an array class
public class Array {
    private int[] items;
    private int count;

    // declaring the size of the array
    public Array(int length) {
        items = new int[length];
    }

    // adding elements into array
    public void insert(int item) {
        // if array is full, reszie it
        if (items.length == count) {
            // create a new array
            int[] newItems = new int[count * 2];
            // copy all the elements into new array
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // assign "items" to the new array
            items = newItems;
        }
        // adding element at the end of array
        items[count++] = item;
    }

    // removing element from a particular index
    public void removeAt(int index) {
        // validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        // shift all the elements to left to fill the hole
        // [10,20,30]
        // index:1
        // array should look like [10,30]
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;

    }

    // finding the index of the element
    public int indexOf(int item) {
        // search for the element, if not found return -1
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    // implementing print method, though we know arrays dont have a print method
    // we are just doing this to ease the work
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.print(items[i] + " ");
    }
}