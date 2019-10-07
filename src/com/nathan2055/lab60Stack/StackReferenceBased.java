/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverstack;

import testlinkedlist.Node;

/**
 *
 * @author fansari
 */
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
    public Object peek() throws StackException {
        if (!isEmpty()) {

            return top.item;
        } else {
            throw new StackException("peek error");
        }
    }

}
