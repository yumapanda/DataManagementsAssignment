class Stack implements Container {
    private int[] buffer;
    private int top;

    public Stack() {
        this(100);
    }

    public Stack(int n) {
        buffer = new int[n];
        top = -1;
    }

    public void push(int x) {
        if (!isFull())
            buffer[++top] = x;
        else
            System.out.println("Stack is full, cannot push " + x);
    }

    public int pop() {
        if (!isEmpty())
            return buffer[top--];
        else {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == buffer.length - 1;
    }

    public int size() {
        return top + 1;
    }
}