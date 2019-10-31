package com.nathan2055.lab70BinaryTree;

public class DriverTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        BinaryTree<Integer> tree3 = new BinaryTree<Integer>(70);

        // build the tree in Figure 11-10
        BinaryTree<Integer> tree1 = new BinaryTree<Integer>();
        tree1.setRootItem(40);
        tree1.attachLeft(30);
        tree1.attachRight(50);

        BinaryTree<Integer> tree2 = new BinaryTree<Integer>();
        tree2.setRootItem(20);
        tree2.attachLeft(10);
        tree2.attachRightSubtree(tree1);

        BinaryTree<Integer> binTree = // tree in Figure 11-10
                new BinaryTree<Integer>(60, tree2, tree3);

        TreeIterator<Integer> btIterator = new TreeIterator<Integer>(binTree);
        btIterator.setPreorder();

        while (btIterator.hasNext()) {
            System.out.println(btIterator.next());

        }

    }

}
