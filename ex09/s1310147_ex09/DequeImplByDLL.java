class DequeImplByDLL implements Deque {
    private SimpleDoublyLinkedList list;
    private int n; // the number of elements in the deque

    DequeImplByDLL() {
        list = new SimpleDoublyLinkedList();
        n = 0;
    }

    @Override
    public void insertFront(int key) {
        list.addFront(key);
        n++;
    }

    @Override
    public void insertBack(int key) {
        list.addBack(key);
        n++;
    }

    @Override
    public void removeFront() {
        if (!empty()) {
            list.removeFront();
            n--;
        }
    }

    @Override
    public void removeBack() {
        if (!empty()) {
            list.removeBack();
            n--;
        }
    }

    @Override
    public int front() {
        if (empty()) throw new IllegalStateException("Deque is empty");
        return list.front();
    }

    @Override
    public int back() {
        if (empty()) throw new IllegalStateException("Deque is empty");
        return list.back();
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean empty() {
        return n == 0;
    }
}
