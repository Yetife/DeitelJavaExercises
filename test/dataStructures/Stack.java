package dataStructures;

public class Stack {
    public static Class<? extends Throwable> UnderflowException;
    private int numberOfelement;
    private int[] elements;

    public Stack(int capacity) {
        elements = new int[capacity];
    }

    public void push(int element) {
        if(isFull()) throw new OverFlowException("Stack is full");
        elements[numberOfelement] = element;
        numberOfelement++;
    }

    private boolean isFull() {
        return size() == elements.length;
    }

    public int size() {
        return numberOfelement;
    }

    public int pop() {
        if(isEmpty()) throw new UnderflowException("Stack is empty");
        numberOfelement--;
        return numberOfelement;
    }

    public boolean isEmpty() {
        return numberOfelement == 0;
    }

    public int peek() {
        if(isEmpty()) throw new UnderflowException("Stack is empty");
        return elements[numberOfelement-1];
    }

    public static class UnderflowException extends RuntimeException
    {
        public UnderflowException(String message)
        {
            super(message);
        }
    }

    public static class OverFlowException extends RuntimeException{
        public OverFlowException(String message)
        {
            super(message);
        }
    }
}
