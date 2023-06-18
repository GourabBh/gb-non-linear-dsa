package dev.gourab.nonlinear.dsa.trees.utility;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;
import dev.gourab.nonlinear.dsa.trees.model.bstSubTreeContract.BSTSubTreeRefFunc;
import dev.gourab.nonlinear.dsa.trees.utility.impl.BSTSubTreeRefImplUtility;

public class BSTSubTreeRefUtility {
	private static TreeNode<Integer> getBSTSubTree(TreeNode<Integer> rootNode,
			BSTSubTreeRefFunc<Integer> bstSubTreeRefFunc) {
		if (bstSubTreeRefFunc == null) {
			throw new IllegalArgumentException("The BST subtree retrieval function seems absent!");
		}
		return bstSubTreeRefFunc.getBSTSubTree(rootNode);
	}

	public static TreeNode<Integer> getBSTSubTree(TreeNode<Integer> rootNode) {
		return getBSTSubTree(rootNode, BSTSubTreeRefImplUtility::getBSTLeftSubTreeRef);
	}
}
