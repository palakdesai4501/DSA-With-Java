// Custom stack Implementation
public class StackCustom {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public StackCustom() {
        this(DEFAULT_SIZE);
    }

    public StackCustom(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws stack_exception {
        if (isEmpty()) {
            throw new stack_exception("Cannot pop from empty stack");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }

    public int peek() throws stack_exception {
        if (isEmpty()) {
            throw new stack_exception("Cannot peek from empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1; // ptr is at last index
    }
}
