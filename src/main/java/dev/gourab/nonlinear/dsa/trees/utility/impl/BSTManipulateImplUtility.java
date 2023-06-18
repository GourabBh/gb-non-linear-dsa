package dev.gourab.nonlinear.dsa.trees.utility.impl;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;
import dev.gourab.nonlinear.dsa.trees.utility.BSTSubTreeRefUtility;

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

	public static void deleteBSTNode(TreeNode<Integer> rootNode, int nodeValue) {
		if (rootNode == null) {
			throw new IllegalArgumentException("Root Node of BST is an invalid reference!");
		}
		var treeNode = rootNode;
		while (true) {
			if (nodeValue < treeNode.getValue()) {
				var currLeftNode = treeNode.getLeft();
				if (currLeftNode != null) {
					if (nodeValue == currLeftNode.getValue()) {
						treeNode.setLeft(BSTSubTreeRefUtility.getBSTSubTree(currLeftNode));
						break;
					} else {
						treeNode = currLeftNode;
					}
				}
			} else {
				var currRightNode = treeNode.getRight();
				if (currRightNode != null) {
					if (nodeValue == currRightNode.getValue()) {
						treeNode.setRight(BSTSubTreeRefUtility.getBSTSubTree(currRightNode));
						break;
					} else {
						treeNode = currRightNode;
					}
				}
			}
		}
	}

}
