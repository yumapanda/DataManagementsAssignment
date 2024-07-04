package impl;

import template.BinaryTreeTraverser;
import template.BinaryTreeNode;

public class PostOrderTraversal extends BinaryTreeTraverser {
    @Override
    public void initialize() {
        System.out.println("Begin Post-order Traversal");
    }

    @Override
    public void finalize() {
        System.out.println("End Post-order Traversal");
    }

    @Override
    public void performPost(BinaryTreeNode u) {
        System.out.print(u.getKey() + " ");
    }
}
