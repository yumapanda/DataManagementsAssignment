import java.util.LinkedList;

public class Stack implements OpenList {
    private LinkedList<Integer> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    @Override
    public void push(int value) {
        stack.addFirst(value);
    }

    @Override
    public int pop() {
        return stack.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
