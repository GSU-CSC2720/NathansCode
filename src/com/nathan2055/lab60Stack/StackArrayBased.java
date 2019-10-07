/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverstack;

/**
 *
 * @author fansari
 */
public class StackArrayBased implements StackInterface{
    final int MAX_STACK =50;
    private Object items[];
    private int top;
    
    public StackArrayBased(){
        items = new Object[MAX_STACK];
        top = -1;
    }
    
    public boolean isEmpty(){
        return top<-1;
    }
    
    public boolean isFull(){
        return top == MAX_STACK-1;
    }
    public void push(Object newItem) throws StackException{
        if(!isFull()){
            items[++top] = newItem;
        }
        else{
            throw new StackException("pushh error");
        }
    }
    public Object pop() throws StackException{
        if(!isFull()){
            return items[top--];
        }
        else{
            throw new StackException("pop error");
        }
    }
    public Object peek() throws StackException{
        if(!isFull()){
            return items[top];
        }
        else{
            throw new StackException("pop error");
        }
    }

    @Override
    public void popAll() {
        items = new Object[MAX_STACK];
        top = -1;
    }
}
