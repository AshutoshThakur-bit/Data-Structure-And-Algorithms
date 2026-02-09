package Stack;

// Stack implementation using Array in Java
class Stack {
    private int top;
    private int[] stackArray;
    private int capacity;

    // Constructor to initialize stack
    public Stack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }

    // Push element into stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed into stack.");
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop element.");
            return -1;
        }
        int popped = stackArray[top--];
        System.out.println(popped + " popped from stack.");
        return popped;
    }

    // Peek top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackArray[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

// Main class to test stack
public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.display();

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); // should show overflow
        stack.display();
    }
}
