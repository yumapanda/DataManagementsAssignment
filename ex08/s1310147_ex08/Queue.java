import java.util.LinkedList;

public class Queue implements OpenList {
    private LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    @Override
    public void push(int value) {
        queue.addLast(value);
    }

    @Override
    public int pop() {
        return queue.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
