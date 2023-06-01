import java.util.Stack;

public class CustomStack {

    protected int[] data;
    private int pointer = -1;
    private final static int DEFAULT_SIZE = 10;

    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }


    public CustomStack(int size) {
        this.data = new int[size];
    }

    public int push(int element) throws StackException {
        if(isFull()) {
            throw new StackException("Stack is full");
          
          // to make it dynamic just double the array size and copy all elements in it 
          int[] temp = new int[data.length * 2];
            for(int i = 0; i<data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        pointer++;
        data[pointer] = element;
        return element;
    }

     public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Cannot pop from empty Stack");
        }
        pointer--;
        return data[pointer+1];
     }

    public boolean isFull() {
        if (pointer == data.length - 1) {
            return true;
        }
        return false;
    }

    public  boolean isEmpty() {
        if(pointer == -1) {
            return true;
        }
        return false;
    }


}
