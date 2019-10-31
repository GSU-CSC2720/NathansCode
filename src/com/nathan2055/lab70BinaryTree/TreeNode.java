/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivertree;

/**
 *
 * @author fansari
 */
/**
 *
 * @author forough
 */
public class TreeNode<T> {

    T item;
    TreeNode<T> leftChild;
    TreeNode<T> rightChild;

    public TreeNode(T newItem) {
        // Initializes tree node with item and no children.
        item = newItem;
        leftChild = null;
        rightChild = null;
    }  // end constructor

    public TreeNode(T newItem,
            TreeNode<T> left, TreeNode<T> right) {
  // Initializes tree node with item and
        // the left and right children references.
        item = newItem;
        leftChild = left;
        rightChild = right;
    }  // end constructor

}  // end TreeNode
