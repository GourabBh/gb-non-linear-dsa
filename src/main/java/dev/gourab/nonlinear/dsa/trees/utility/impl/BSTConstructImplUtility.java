package dev.gourab.nonlinear.dsa.trees.utility.impl;

import java.util.List;

import dev.gourab.nonlinear.dsa.trees.model.IndexObj;
import dev.gourab.nonlinear.dsa.trees.model.TreeNode;

public class BSTConstructImplUtility {
	public static TreeNode<Integer> constructBST(List<Integer> preOrderList) {
		int upperBound = Integer.MAX_VALUE;
		IndexObj indexAsRef = new IndexObj(0);
		return constructBST(preOrderList, upperBound, indexAsRef);
	}

	private static TreeNode<Integer> constructBST(List<Integer> preOrderList, int upperBound, IndexObj indexAsRef) {
		int index = indexAsRef.getIndex();
		if (index == preOrderList.size() || preOrderList.get(index) > upperBound) {
			return null;
		}
		TreeNode<Integer> rootNode = new TreeNode<>(preOrderList.get(index));
		indexAsRef.setIndex(index + 1);
		rootNode.setLeft(constructBST(preOrderList, rootNode.getValue(), indexAsRef));
		rootNode.setRight(constructBST(preOrderList, upperBound, indexAsRef));
		return rootNode;
	}
}
