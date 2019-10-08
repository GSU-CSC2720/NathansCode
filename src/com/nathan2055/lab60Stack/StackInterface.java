package com.nathan2055.lab60Stack;

public interface StackInterface {
    public boolean isEmpty();
    public void popAll();
    public void push(Object newItem) throws StackException;
    public Object pop() throws StackException;
    public void popAndDiscard(int count) throws StackException;
    public Object peek() throws StackException;
}
