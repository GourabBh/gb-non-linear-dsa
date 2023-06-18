package dev.gourab.nonlinear.dsa.trees.utility.impl;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;

public class BSTNodeImplUtility {
	public static TreeNode<Integer> getBSTCeilNode(TreeNode<Integer> rootNode, int nodeValue) {
		if (rootNode == null) {
			return null;
		}
		TreeNode<Integer> ceilNode = null;
		while (rootNode != null) {
			if (nodeValue == rootNode.getValue()) {
				return rootNode;
			} else if (nodeValue < rootNode.getValue()) {
				ceilNode = rootNode;
				rootNode = rootNode.getLeft();
			} else {
				rootNode = rootNode.getRight();
			}
		}
		return ceilNode;
	}

	public static TreeNode<Integer> getBSTFloorNode(TreeNode<Integer> rootNode, int nodeValue) {
		if (rootNode == null) {
			return null;
		}
		TreeNode<Integer> floorNode = null;
		while (rootNode != null) {
			if (nodeValue == rootNode.getValue()) {
				return rootNode;
			} else if (nodeValue > rootNode.getValue()) {
				floorNode = rootNode;
				rootNode = rootNode.getRight();
			} else {
				rootNode = rootNode.getLeft();
			}
		}
		return floorNode;
	}

	public static TreeNode<Integer> searchBSTNode(TreeNode<Integer> rootNode, int nodeValue) {
		if (rootNode == null) {
			return null;
		}
		while (rootNode != null && rootNode.getValue() != nodeValue) {
			rootNode = rootNode.getValue() > nodeValue ? rootNode.getLeft() : rootNode.getRight();
		}
		return rootNode;
	}

	public static TreeNode<Integer> getSuccessorNode(TreeNode<Integer> rootNode, int nodeValue) {
		if (rootNode == null) {
			return null;
		}
		TreeNode<Integer> successorNode = null;
		while (rootNode != null) {
			if (nodeValue < rootNode.getValue()) {
				successorNode = rootNode;
				rootNode = rootNode.getLeft();
			} else {
				rootNode = rootNode.getRight();
			}
		}
		return successorNode;
	}

	public static TreeNode<Integer> getPredecessorNode(TreeNode<Integer> rootNode, int nodeValue) {
		if (rootNode == null) {
			return null;
		}
		TreeNode<Integer> predecessorNode = null;
		while (rootNode != null) {
			if (nodeValue > rootNode.getValue()) {
				predecessorNode = rootNode;
				rootNode = rootNode.getRight();
			} else {
				rootNode = rootNode.getLeft();
			}
		}
		return predecessorNode;
	}

	

	
}
