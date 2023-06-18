package dev.gourab.nonlinear.dsa.trees.utility;

import java.util.List;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;
import dev.gourab.nonlinear.dsa.trees.model.constructContract.ConstructBSTFunc;
import dev.gourab.nonlinear.dsa.trees.utility.impl.BSTConstructImplUtility;

public class BSTConstructUtility {
	private static TreeNode<Integer> constructBST(List<Integer> dfsTypeList,
			ConstructBSTFunc<Integer> constructBSTFunc) {
		if (constructBSTFunc == null) {
			throw new IllegalArgumentException("The BST construct function seems absent!");
		}
		return constructBSTFunc.constructBST(dfsTypeList);
	}

	public static TreeNode<Integer> constructBSTFromPreOrder(List<Integer> preOrderList) {
		if (preOrderList == null || preOrderList.isEmpty()) {
			System.out.println("PreOrder list is either empty or invalid.");
			return new TreeNode<Integer>(-1);
		}
		return constructBST(preOrderList, BSTConstructImplUtility::constructBST);
	}
}
