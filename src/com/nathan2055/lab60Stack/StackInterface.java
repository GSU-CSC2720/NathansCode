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
public interface StackInterface {
    public boolean isEmpty();
    public void popAll();
    public void push(Object newItem) throws StackException;
    public Object pop() throws StackException;
    public Object peek() throws StackException;
}
