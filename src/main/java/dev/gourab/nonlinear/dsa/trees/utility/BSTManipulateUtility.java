package dev.gourab.nonlinear.dsa.trees.utility;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;
import dev.gourab.nonlinear.dsa.trees.model.bstManipulateContract.BSTManipulationFunc;
import dev.gourab.nonlinear.dsa.trees.utility.impl.BSTManipulateImplUtility;

public class BSTManipulateUtility {
	private static void manipulateBST(TreeNode<Integer> rootNode, int nodeValue,
			BSTManipulationFunc<Integer> bstManipulationFunc) {
		if (bstManipulationFunc == null) {
			throw new IllegalArgumentException("The BST Manipulate Func is invalid!");
		}
		bstManipulationFunc.manipulateBSTNode(rootNode, nodeValue);
	}

	public static void insertBSTNodes(TreeNode<Integer> rootNode, int nodeValue) {
		manipulateBST(rootNode, nodeValue, BSTManipulateImplUtility::insertBSTNode);
	}

	public static void deleteBSTNodes(TreeNode<Integer> rootNode, int nodeValue) {
		manipulateBST(rootNode, nodeValue, BSTManipulateImplUtility::deleteBSTNode);
	}
}
