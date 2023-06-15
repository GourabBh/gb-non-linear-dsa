package dev.gourab.nonlinear.dsa.trees.service;

import java.util.List;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;
import dev.gourab.nonlinear.dsa.trees.model.traversalContract.BSTTraversal;

public class BSTService {

	private final BSTTraversal<Integer> bstTraversalFunc;

	public BSTService(BSTTraversal<Integer> bstTraversalFunc) {
		this.bstTraversalFunc = bstTraversalFunc;
	}

	public List<Integer> getTreeNodesAsList(TreeNode<Integer> rootNode) {
		if (bstTraversalFunc == null) {
			throw new IllegalArgumentException("Provide the traversal contract!");
		}
		return bstTraversalFunc.getTreeNodes(rootNode);
	}

}
