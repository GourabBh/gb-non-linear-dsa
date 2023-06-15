package dev.gourab.nonlinear.dsa.trees.model.nodeContract;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;

@FunctionalInterface
public interface BSTNodeFunc<T> {
	TreeNode<T> searchBSTNode(TreeNode<T> treeNode, T nodeValue);
}
