import java.util.Stack;

public class SimpleListBackwardIterator implements Iterator {
    private Stack<SimpleNode> stack;

    public SimpleListBackwardIterator(SimpleList simpleList) {
        stack = new Stack<>();
        SimpleNode cur = simpleList.getNil().getNext();
        while (cur != simpleList.getNil()) {
            stack.push(cur);
            cur = cur.getNext();
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Object next() {
        return stack.pop().getData();
    }
}

