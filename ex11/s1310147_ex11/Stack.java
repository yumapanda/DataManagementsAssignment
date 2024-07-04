public class Stack {
    private int[] array;
    private int top;
    private int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        top = -1;
    }

    public void push(int value) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("Overflow. " + value + " can not be pushed.");
        }
        array[++top] = value;
    }

    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Underflow. There is no element in the stack.");
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
