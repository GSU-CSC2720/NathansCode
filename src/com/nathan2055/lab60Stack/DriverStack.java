package com.nathan2055.lab60Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ADT STACK HAS 3 IMPLEMENTATIONS
 * <p>
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
        // Generate a random stack of each type
        StackInterface stack1 = getRandomArrayStack(10);
        StackInterface stack2 = getRandomListStack(10);
        StackInterface stack3 = getRandomReferenceStack(10);

        // Test displayStack on each type of stack
        System.out.println(displayStack(stack1));
        System.out.println(displayStack(stack2));
        System.out.println(displayStack(stack3));

        // Test popAndDiscard on each type of stack
        stack1.popAndDiscard(5);
        System.out.println(displayStack(stack1));
        stack2.popAndDiscard(5);
        System.out.println(displayStack(stack2));
        stack3.popAndDiscard(5);
        System.out.println(displayStack(stack3));

        // Ensure no crashes occur if a stack is emptied via popAndDiscard
        stack1.popAndDiscard(6);
        System.out.println(displayStack(stack1));
        stack2.popAndDiscard(6);
        System.out.println(displayStack(stack2));
        stack3.popAndDiscard(6);
        System.out.println(displayStack(stack3));
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

    private static StackInterface getRandomArrayStack(int size) {
        Random rand = new Random();
        StackInterface stack = new StackReferenceBased();
        for (int i = 0; i < size; i++) {
            stack.push(rand.nextInt());
        }
        return stack;
    }

    private static StackInterface getRandomListStack(int size) {
        Random rand = new Random();
        StackInterface stack = new StackReferenceBased();
        for (int i = 0; i < size; i++) {
            stack.push(rand.nextInt());
        }
        return stack;
    }

    private static StackInterface getRandomReferenceStack(int size) {
        Random rand = new Random();
        StackInterface stack = new StackReferenceBased();
        for (int i = 0; i < size; i++) {
            stack.push(rand.nextInt());
        }
        return stack;
    }
}
