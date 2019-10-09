package com.nathan2055.lab60Stack;

public class StackArrayBased implements StackInterface {
    final int MAX_STACK = 50;
    private Object items[];
    private int top;

    public StackArrayBased() {
        items = new Object[MAX_STACK];
        top = -1;
    }

    public boolean isEmpty() {
        return top < -1;
    }

    public boolean isFull() {
        return top == MAX_STACK - 1;
    }

    public void push(Object newItem) throws StackException {
        if (!isFull()) {
            items[++top] = newItem;
        } else {
            throw new StackException("push error");
        }
    }

    public Object pop() throws StackException {
        if (!isFull()) {
            return items[top--];
        } else {
            throw new StackException("pop error");
        }
    }

    public void popAndDiscard(int count) throws StackException {
        int check = count;
        while (!isFull()) {
            for (int i = 0; i < count; i++) {
                Object item = items[top--];
                check--;
            }
        }
        /*if (check != 0) {
            throw new StackException("Attempted to remove more items than exist in the stack");
        }*/
    }

    public Object peek() throws StackException {
        if (!isFull()) {
            return items[top];
        } else {
            throw new StackException("pop error");
        }
    }

    @Override
    public void popAll() {
        items = new Object[MAX_STACK];
        top = -1;
    }
}
