package dev.gourab.nonlinear.dsa.trees.model.traversalContract;

import java.util.List;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;

@FunctionalInterface
public interface BSTTraversal {
	List<Integer> getTreeNodes(TreeNode<Integer> rootNode);
}
