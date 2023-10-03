package com.bst;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        // Add 56 as the root node.
        bst.insert(56);

        // Add 30 to the left of the root node.
        bst.insert(30);

        // Add 70 to the right of the root node.
        bst.insert(70);

        // Print the BST in order.
        bst.printInOrder();
    }
}

