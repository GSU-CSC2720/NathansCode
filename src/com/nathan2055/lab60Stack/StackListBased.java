package com.nathan2055.lab60Stack;

public class StackListBased implements StackInterface {
    private ListInterface list;

    public StackListBased() {
        list = new ListReferenceBased();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void popAll() {
        list.removeAll();
    }

    @Override
    public void push(Object newItem) throws StackException {
        list.add(0, newItem);
    }

    @Override
    public Object pop() throws StackException {
        if (!list.isEmpty()) {
            Object temp = list.get(0);
            list.remove(0);
            return temp;
        } else {
            throw new StackException("pop error");
        }
    }

    @Override
    public void popAndDiscard(int count) throws StackException {
        try {
            for (int i = 0; i < count; i++) {
                list.remove(0);
            }
        } catch (Exception e) {
            throw new StackException("pop error");
        }
    }

    @Override
    public Object peek() throws StackException {
        if (!isEmpty()) {
            return list.get(0);

        } else {
            throw new StackException("pop error");
        }
    }
}
