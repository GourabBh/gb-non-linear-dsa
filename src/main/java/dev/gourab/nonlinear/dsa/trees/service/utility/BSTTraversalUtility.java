package dev.gourab.nonlinear.dsa.trees.service.utility;

import java.util.Collections;
import java.util.List;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;
import dev.gourab.nonlinear.dsa.trees.model.traversalContract.BSTTraversal;
import dev.gourab.nonlinear.dsa.trees.model.traversalImpl.BSTTraversalImplUtility;

public class BSTTraversalUtility {

	private static List<Integer> getTreeNodesAsList(TreeNode<Integer> rootNode, BSTTraversal traversalFunc) {
		if (traversalFunc == null) {
			throw new IllegalArgumentException("Provide the traversal contract!");
		}
		return traversalFunc.getTreeNodes(rootNode);
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

}
