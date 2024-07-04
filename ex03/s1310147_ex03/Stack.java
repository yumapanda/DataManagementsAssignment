import java.util.Scanner;

class Stack {
    private int[] stackArray;
    private int top;
    private final int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1; 
        }
        return stackArray[top--];
    }
}
