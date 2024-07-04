package impl;

import template.BinaryTreeTraverser;
import template.BinaryTreeNode;

public class EulerTour extends BinaryTreeTraverser {
    @Override
    public void initialize() {
        System.out.println("Begin Euler Tour");
    }

    @Override
    public void finalize() {
        System.out.println("End Euler Tour");
    }

    @Override
    public void performPre(BinaryTreeNode u) {
        System.out.print(u.getKey() + " ");
    }

    @Override
    public void performPost(BinaryTreeNode u) {
        System.out.print(u.getKey() + " ");
    }
}
