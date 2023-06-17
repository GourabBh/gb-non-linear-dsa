package dev.gourab.nonlinear.dsa.trees.utility.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;

public class BSTTraversalImplUtility {

	public static List<Integer> inOrder(TreeNode<Integer> rootNode) {
		if (rootNode == null) {
			return Collections.emptyList();
		}
		List<Integer> inOrder = new ArrayList<>();
		var inOrderStack = new Stack<TreeNode<Integer>>();
		while (rootNode != null || !inOrderStack.isEmpty()) {
			if (rootNode != null) {
				inOrderStack.push(rootNode);
				rootNode = rootNode.getLeft();
			} else {
				var poppedNode = inOrderStack.pop();
				if (poppedNode != null) {
					inOrder.add(poppedNode.getValue());
					rootNode = poppedNode.getRight();
				}
			}
		}
		return inOrder;
	}

	public static List<Integer> postOrder(TreeNode<Integer> rootNode) {
		if (rootNode == null) {
			return Collections.emptyList();
		}
		List<Integer> postOrder = new ArrayList<>();
		var postOrderStack = new Stack<TreeNode<Integer>>();
		while (rootNode != null || !postOrderStack.isEmpty()) {
			if (rootNode != null) {
				postOrderStack.push(rootNode);
				rootNode = rootNode.getLeft();
			} else {
				var tempNode = postOrderStack.peek().getRight();
				if (tempNode != null) {
					rootNode = tempNode;
				} else {
					var poppedNode = postOrderStack.pop();
					postOrder.add(poppedNode.getValue());
					while (!postOrderStack.isEmpty() && poppedNode == postOrderStack.peek().getRight()) {
						poppedNode = postOrderStack.pop();
						postOrder.add(poppedNode.getValue());
					}
				}
			}
		}
		return postOrder;
	}

	private static int getCountOfNodes(TreeNode<Integer> rootNode) {
		if (rootNode == null) {
			return 0;
		}
		int nodeCount = 0;
		var stack = new Stack<TreeNode<Integer>>();
		while (rootNode != null || !stack.isEmpty()) {
			if (rootNode != null) {
				nodeCount++;
				stack.push(rootNode);
				rootNode = rootNode.getLeft();
			} else {
				var poppedNode = stack.pop();
				if (poppedNode != null) {
					rootNode = poppedNode.getRight();
				}
			}
		}
		return nodeCount;
	}

	public static String levelOrder(TreeNode<Integer> rootNode) {
		if (rootNode == null) {
			return "null";
		}
		int indexMax = getCountOfNodes(rootNode) - 1;
		if (indexMax < 0) {
			return "EMPTY";
		}
		var nodeValuesBuilder = new StringBuilder();
		nodeValuesBuilder.append("[ ");
		Queue<TreeNode<Integer>> levelOrderQueue = new LinkedList<>();
		levelOrderQueue.offer(rootNode);
		int trackQueueNodes = 0;
		while (!levelOrderQueue.isEmpty()) {
			int currentLevelSize = levelOrderQueue.size();
			nodeValuesBuilder.append("(");
			for (int index = 0; index < currentLevelSize; index++) {
				var polledNode = levelOrderQueue.poll();
				if (polledNode != null) {
					nodeValuesBuilder.append(polledNode.getValue());
					if (trackQueueNodes == indexMax) {
						return nodeValuesBuilder.append(") ]").toString();
					}
					if (index == currentLevelSize - 1) {
						nodeValuesBuilder.append("), ");
					} else {
						nodeValuesBuilder.append(", ");
					}
					if (polledNode.getLeft() != null) {
						levelOrderQueue.offer(polledNode.getLeft());
					}
					if (polledNode.getRight() != null) {
						levelOrderQueue.offer(polledNode.getRight());
					}
				}
				trackQueueNodes++;
			}
		}
		return "INVALID";
	}

	public static List<Integer> preOrder(TreeNode<Integer> rootNode) {
		if (rootNode == null) {
			return Collections.emptyList();
		}
		List<Integer> preOrder = new ArrayList<>();
		Stack<TreeNode<Integer>> preOrderStack = new Stack<>();
		preOrderStack.push(rootNode);
		while (!preOrderStack.isEmpty()) {
			var poppedNode = preOrderStack.pop();
			preOrder.add(poppedNode.getValue());
			if (poppedNode.getRight() != null) {
				preOrderStack.push(poppedNode.getRight());
			}
			if (poppedNode.getLeft() != null) {
				preOrderStack.push(poppedNode.getLeft());
			}
		}
		return preOrder;
	}
}
