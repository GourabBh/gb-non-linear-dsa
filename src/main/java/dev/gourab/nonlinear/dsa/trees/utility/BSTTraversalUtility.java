package dev.gourab.nonlinear.dsa.trees.utility;

import java.util.Collections;
import java.util.List;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;
import dev.gourab.nonlinear.dsa.trees.model.traversalContract.BSTTraversal;
import dev.gourab.nonlinear.dsa.trees.model.traversalContract.BSTTraversalString;
import dev.gourab.nonlinear.dsa.trees.utility.impl.BSTTraversalImplUtility;

public class BSTTraversalUtility {

	private static List<Integer> getTreeNodesAsList(TreeNode<Integer> rootNode, BSTTraversal<Integer> traversalFunc) {
		if (traversalFunc == null) {
			throw new IllegalArgumentException("Provide the traversal contract!");
		}
		return traversalFunc.getTreeNodes(rootNode);
	}

	private static String getTreeNodesAsString(TreeNode<Integer> rootNode, BSTTraversalString<Integer> traversalFunc) {
		if (traversalFunc == null) {
			throw new IllegalArgumentException("Provide the traversal contract!");
		}
		return traversalFunc.getTreeNodesAsString(rootNode);
	}

	public static List<Integer> getInOrderRepr(TreeNode<Integer> treeNode) {
		if (treeNode == null) {
			return Collections.emptyList();
		}
		return getTreeNodesAsList(treeNode, BSTTraversalImplUtility::inOrder);
	}

	public static List<Integer> getPostOrderRepr(TreeNode<Integer> treeNode) {
		if (treeNode == null) {
			return Collections.emptyList();
		}
		return getTreeNodesAsList(treeNode, BSTTraversalImplUtility::postOrder);
	}

	public static String getLevelOrderRepr(TreeNode<Integer> treeNode) {
		return getTreeNodesAsString(treeNode, BSTTraversalImplUtility::levelOrder);
	}

}
