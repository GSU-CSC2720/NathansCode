package com.nathan2055.lab60Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ADT STACK HAS 3 IMPLEMENTATIONS
 *
 * 1. StackArrayBased uses arrays to create the stack
 * 2. StackListBased uses a referenced linked list structure to create the stack
 * 3. StackReferenceBased which has been implemented using a referenced-based linked list
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

    private static String displayStack(StackInterface stack) {
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

    private static StackInterface getRandomStack(int size) {
        Random rand = new Random();
        StackInterface stack = new StackReferenceBased();
        for (int i = 0; i < size; i++) {
            stack.push(rand.nextInt());
        }
        return stack;
    }
}
