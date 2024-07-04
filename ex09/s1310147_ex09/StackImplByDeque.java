class StackImplByDeque implements Stack {
    private Deque deque;

    StackImplByDeque() {
        this.deque = new DequeImplByDLL();
    }

    @Override
    public void push(int x) {
        deque.insertBack(x);
    }

    @Override
    public int pop() {
        if (empty()) throw new IllegalStateException("Stack is empty");
        int value = deque.back();
        deque.removeBack();
        return value;
    }

    @Override
    public int top() {
        if (empty()) throw new IllegalStateException("Stack is empty");
        return deque.back();
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean empty() {
        return deque.empty();
    }
}
