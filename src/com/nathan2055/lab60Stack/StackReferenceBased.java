package com.nathan2055.lab60Stack;

public class StackReferenceBased implements StackInterface {
    private Node top;

    public StackReferenceBased() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void popAll() {
        top = null;
    }

    @Override
    public void push(Object newItem) throws StackException {
        top = new Node(newItem, top);
    }

    @Override
    public Object pop() throws StackException {
        if (!isEmpty()) {
            Node temp = top;
            top = top.next;
            return temp.item;
        } else {
            throw new StackException("pop error");
        }
    }

    @Override
    public void popAndDiscard(int count) throws StackException {
        int check = count;
        while (!isEmpty()) {
            for (int i = 0; i < count; i++) {
                Node temp = top;
                top = top.next;
                check = check--;
            }
        }
        /*if (check != 0) {
            throw new StackException("Attempted to remove more items than exist in the stack");
        }*/
    }


    @Override
    public Object peek() throws StackException {
        if (!isEmpty()) {
            return top.item;
        } else {
            throw new StackException("peek error");
        }
    }
}
