package dev.gourab.nonlinear.dsa.trees.utility;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;
import dev.gourab.nonlinear.dsa.trees.model.nodeContract.BSTNodeFunc;
import dev.gourab.nonlinear.dsa.trees.utility.impl.BSTNodeImplUtility;

public class BSTNodeUtility {
	private static TreeNode<Integer> searchBSTNode(TreeNode<Integer> rootNode, int nodeValue,
			BSTNodeFunc<Integer> bstNodeFunc) {
		if (bstNodeFunc == null) {
			throw new IllegalArgumentException("Provide the treeNode contract! The contract is invalid!");
		}
		return bstNodeFunc.searchBSTNode(rootNode, nodeValue);
	}

	public static TreeNode<Integer> getBSTCeilNode(TreeNode<Integer> rootNode, int nodeValue) {
		return searchBSTNode(rootNode, nodeValue, BSTNodeImplUtility::getBSTCeilNode);
	}

	public static TreeNode<Integer> getBSTFloorNode(TreeNode<Integer> rootNode, int nodeValue) {
		return searchBSTNode(rootNode, nodeValue, BSTNodeImplUtility::getBSTFloorNode);
	}

	public static TreeNode<Integer> searchBSTNode(TreeNode<Integer> rootNode, int nodeValue) {
		return searchBSTNode(rootNode, nodeValue, BSTNodeImplUtility::searchBSTNode);
	}
}
