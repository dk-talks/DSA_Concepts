

public class CustomQueue {

    protected int data[];

    public int end = 0;

    private static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        // this will call the constructor which takes int as parameter and makes a new array
        // alternatively I could write data = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }

    public  CustomQueue(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) throws Exception {
        if(isFull()) {
            throw new Exception("Queue is full: Come back later");
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot remove from empty row: Please fill it");
        }
        // now this is important in queues, we have to remove element of first index .ie 0
        // we have to shift every element to left from index 1

        // but the time complexity to remove just one item is O(n), that is not good
        int removedItem = data[0];

        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;

        return removedItem;
    }

    public void displayQueue() {
        for(int i = 0; i<end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println();
    }




}
