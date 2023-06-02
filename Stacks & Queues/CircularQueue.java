public class CircularQueue {

    protected int data[];

    public int last = 0;
    public int front = 0;
    public int size = 0;

    private static final int DEFAULT_SIZE = 10;

    public CircularQueue() {
        // this will call the constructor which takes int as parameter and makes a new array
        // alternatively I could write data = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }

    public  CircularQueue(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return data.length == size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) throws Exception {
        if(isFull()) {
            throw new Exception("Queue is full: Come back later");
        }

        data[last++] = item;
        last = last % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot remove from empty row: Please fill it");
        }
        int removedItem = data[front];

        front++;
        front = front % data.length;
        size--;

        return removedItem;
    }

    public void displayQueue() {
        if(isEmpty()) {
            System.out.println("Empty Queue");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i++] + "<= ");
            i %= data.length;
        } while(i != last);
        System.out.println("END");
    }




}
