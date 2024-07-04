class QueueImplByDeque implements Queue {
    private Deque deque;

    QueueImplByDeque() {
        this.deque = new DequeImplByDLL();
    }

    @Override
    public void enqueue(int key) {
        deque.insertBack(key);
    }

    @Override
    public int dequeue() {
        if (empty()) throw new IllegalStateException("Queue is empty");
        int value = deque.front();
        deque.removeFront();
        return value;
    }

    @Override
    public int front() {
        if (empty()) throw new IllegalStateException("Queue is empty");
        return deque.front();
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
