package dev.gourab.nonlinear.dsa.trees.model.traversalContract;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;

@FunctionalInterface
public interface BSTTraversalString<T> {
	String getTreeNodesAsString(TreeNode<T> treeNode);
}
