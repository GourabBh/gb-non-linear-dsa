package dev.gourab.nonlinear.dsa.trees.utility.impl;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;

public class BSTSubTreeRefImplUtility {
	public static <T> TreeNode<T> getBSTLeftSubTreeRef(TreeNode<T> treeNode) {
		if (treeNode.getLeft() == null) {
			return treeNode.getRight();
		} else if (treeNode.getRight() == null) {
			return treeNode.getLeft();
		}
		var currLeftNode = treeNode.getLeft();
		var lastLeftNodeOfRightSubTree = findLeftLeafNode(treeNode.getRight());
		lastLeftNodeOfRightSubTree.setLeft(currLeftNode);
		return treeNode.getRight();
	}

	private static <T> TreeNode<T> findLeftLeafNode(TreeNode<T> treeNode) {
		if (treeNode.getLeft() == null) {
			return treeNode;
		}
		return findLeftLeafNode(treeNode.getLeft());
	}
}
