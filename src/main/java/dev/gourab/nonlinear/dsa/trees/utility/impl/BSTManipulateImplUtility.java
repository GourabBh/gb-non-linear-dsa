package dev.gourab.nonlinear.dsa.trees.utility.impl;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;

public class BSTManipulateImplUtility {

	public static void insertBSTNode(TreeNode<Integer> rootNode, int nodeValue) {
		if (rootNode == null) {
			throw new IllegalArgumentException("Root Node of BST is an invalid reference!");
		}
		while (true) {
			if (rootNode.getValue() > nodeValue) {
				if (rootNode.getLeft() == null) {
					rootNode.setLeft(new TreeNode<Integer>(nodeValue));
					break;
				} else {
					rootNode = rootNode.getLeft();
				}
			} else {
				if (rootNode.getRight() == null) {
					rootNode.setRight(new TreeNode<Integer>(nodeValue));
					break;
				} else {
					rootNode = rootNode.getRight();
				}
			}
		}
	}

}
