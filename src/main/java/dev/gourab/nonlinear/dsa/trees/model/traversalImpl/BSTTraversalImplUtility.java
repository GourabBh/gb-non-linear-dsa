package dev.gourab.nonlinear.dsa.trees.model.traversalImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

}
