package com.nathan2055.lab60Stack;

public class Node {
    Object item;
    Node next;

    public Node(Object a) {
        item = a;
        next = null;
    }

    public Node(Object a, Node b) {
        item = a;
        next = b;
    }
}
