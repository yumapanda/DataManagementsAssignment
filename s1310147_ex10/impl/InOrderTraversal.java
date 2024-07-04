package impl;

import template.BinaryTreeTraverser;
import template.BinaryTreeNode;

public class InOrderTraversal extends BinaryTreeTraverser {
    @Override
    public void initialize() {
        System.out.println("Begin In-order Traversal");
    }

    @Override
    public void finalize() {
        System.out.println("End In-order Traversal");
    }

    @Override
    public void performIn(BinaryTreeNode u) {
        System.out.print(u.getKey() + " ");
    }
}
