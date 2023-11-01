// Implement a queue using two stacks
// This is removal efficient
// Time Complexity: O(1) for pop and peek, O(n) for push
import java.util.Stack;

public class QueueStackRemove {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueStackRemove() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) throws Exception{
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        first.push(item);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public int remove() throws Exception {
        return first.pop();
    }

    public int peek() throws Exception {
       return first.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}
