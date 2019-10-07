/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverstack;

import testlinkedlist.ListInterface;
import testlinkedlist.ListReferenceBased;

/**
 *
 * @author fansari
 */
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
    public Object peek() throws StackException {
        if (!isEmpty()) {
            return list.get(0);

        } else {
            throw new StackException("pop error");
        }
    }

}