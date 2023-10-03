package com.bst;

    class INode implements Comparable<INode> {
        private int key;
        private INode left;
        private INode right;

        public INode(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(INode other) {
            return Integer.compare(this.key, other.key);
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public INode getLeft() {
            return left;
        }

        public void setLeft(INode left) {
            this.left = left;
        }

        public INode getRight() {
            return right;
        }

        public void setRight(INode right) {
            this.right = right;
        }
    }


