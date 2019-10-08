package com.nathan2055.lab60Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ADT STACK HAS 3 IMPLEMENTATION
 * <p>
 * 1. array based is using arrays to creat stack
 * 2. LINKEDlist is using referenced linked list structure to cretae stack
 * 3. adt list which has been implemneted by us using referencedbasedlinkedlist
 *
 * @author fansari
 */
public class DriverStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(displayStack(getRandomStack(10)));
    }

    public static String displayStack(StackInterface stack) {
        String items = "";
        List temp = new ArrayList();
        int size = 0;
        for (int i = 0; !stack.isEmpty(); i++) {
            temp.add(stack.pop());
            size++;
            items = items + temp.get(i);
            if (!stack.isEmpty()) {
                items = items + ", ";
            }
        }
        for (int i = 0; i < size; i++) {
            stack.push(temp.get(i));
        }
        return items;
    }

    public static StackInterface getRandomStack(int size) {
        Random rand = new Random();
        StackInterface stack = new StackReferenceBased();
        for (int i = 0; i < size; i++) {
            stack.push(rand.nextInt());
        }
        return stack;
    }
}
