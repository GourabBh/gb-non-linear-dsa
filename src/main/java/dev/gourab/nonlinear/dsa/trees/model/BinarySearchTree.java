package dev.gourab.nonlinear.dsa.trees.model;

import java.util.stream.IntStream;

public class BinarySearchTree {
	private TreeNode<Integer> rootNode;

	public BinarySearchTree(TreeNode<Integer> rootNode) {
		this.rootNode = rootNode;
	}

	public BinarySearchTree() {
		this(null);
	}

	public TreeNode<Integer> getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode<Integer> rootNode) {
		this.rootNode = rootNode;
	}

	/**
	 * Creates a binary search tree containing {@code numberOfNodes}, with integer
	 * values ranging from {@code minNumber} and {@code maxNumber}.
	 * 
	 * @param numberOfNodes
	 * @param minNumber
	 * @param maxNumber
	 * @return the root of the binary search tree.
	 */
	public void createBST(int numberOfNodes, int minNumber, int maxNumber) {
		if (numberOfNodes < 1) {
			throw new IllegalArgumentException("Number of nodes specified is invalid!");
		}
		IntStream.range(0, numberOfNodes).forEach(time -> {
			int nodeValue = getNodeValue(minNumber, maxNumber);
			insertBinarySearchTreeNodes(nodeValue);
		});
	}

	private int getNodeValue(int minNumber, int maxNumber) {
		return (int) (Math.random() * (maxNumber - minNumber + 1)) + 1;
	}

	private void insertBinarySearchTreeNodes(int nodeValue) {
		if (nodeValue < 0) {
			throw new IllegalArgumentException("Node value provided is invalid");
		}
		if (rootNode == null || rootNode.getValue() == null) {
			rootNode = new TreeNode<>(nodeValue);
		} else {
			insertBSTNodes(rootNode, nodeValue);
		}
	}

	private void insertBSTNodes(TreeNode<Integer> rootNode, int nodeValue) {
		if (nodeValue < rootNode.getValue()) {
			if (rootNode.getLeft() == null) {
				rootNode.setLeft(new TreeNode<>(nodeValue));
			} else {
				insertBSTNodes(rootNode.getLeft(), nodeValue);
			}
		} else {
			if (rootNode.getRight() == null) {
				rootNode.setRight(new TreeNode<>(nodeValue));
			} else {
				insertBSTNodes(rootNode.getRight(), nodeValue);
			}
		}
	}
}
