package com.bst;

public class BST {
    private INode root;

    public BST() {
        this.root = null;
    }

    public void insert(int key) {
        INode newNode = new INode(key);
        if (this.root == null) {
            this.root = newNode;
            return;
        }

        INode currentNode = this.root;
        while (true) {
            if (key < currentNode.getKey()) {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(newNode);
                    return;
                } else {
                    currentNode = currentNode.getLeft();
                }
            } else {
                if (currentNode.getRight() == null) {
                    currentNode.setRight(newNode);
                    return;
                } else {
                    currentNode = currentNode.getRight();
                }
            }
        }
    }

    public void printInOrder() {
        printInOrder(this.root);
    }

    private void printInOrder(INode node) {
        if (node == null) {
            return;
        }

        printInOrder(node.getLeft());
        System.out.println(node.getKey());
        printInOrder(node.getRight());
    }
}

