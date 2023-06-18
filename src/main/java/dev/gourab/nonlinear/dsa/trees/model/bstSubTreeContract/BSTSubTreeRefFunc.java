package dev.gourab.nonlinear.dsa.trees.model.bstSubTreeContract;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;

public interface BSTSubTreeRefFunc<T> {
	TreeNode<T> getBSTSubTree(TreeNode<T> rootNode);
}
