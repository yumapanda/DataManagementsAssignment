package impl;

import template.BinaryTreeTraverser;
import template.BinaryTreeNode;

public class PreOrderTraversal extends BinaryTreeTraverser {
    @Override
    public void initialize() {
        System.out.println("Begin Pre-order Traversal");
    }

    @Override
    public void finalize() {
        System.out.println("End Pre-order Traversal");
    }

    @Override
    public void performPre(BinaryTreeNode u) {
        System.out.print(u.getKey() + " ");
    }
}
