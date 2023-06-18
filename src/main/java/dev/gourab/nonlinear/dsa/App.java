package dev.gourab.nonlinear.dsa;

import java.util.List;

import dev.gourab.nonlinear.dsa.trees.model.BinarySearchTree;
import dev.gourab.nonlinear.dsa.trees.model.TreeNode;
import dev.gourab.nonlinear.dsa.trees.utility.BSTConstructUtility;
import dev.gourab.nonlinear.dsa.trees.utility.BSTManipulateUtility;
import dev.gourab.nonlinear.dsa.trees.utility.BSTNodeUtility;
import dev.gourab.nonlinear.dsa.trees.utility.BSTTraversalUtility;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		// Creating a BST.
		TreeNode<Integer> treeNode = createBST(20, 0, 30);
		if (treeNode == null) {
			System.out.println("Error occured while creating the BST");
			return;
		}
		// InOrder Traversal
		List<Integer> inOrderList = BSTTraversalUtility.getInOrderRepr(treeNode);
		System.out.println("InOrder list: " + inOrderList);

		// PostOrder Traversal
		List<Integer> postOrderList = BSTTraversalUtility.getPostOrderRepr(treeNode);
		System.out.println("PostOrder list: " + postOrderList);

		// LevelOrder Nodes String
		String levelOrderString = BSTTraversalUtility.getLevelOrderRepr(treeNode);
		System.out.println("LevelOrder list: " + levelOrderString);

		int nodeValue = 6;
		// Find the Ceiling BST Node
		System.out.println("Ceiling BST Node of " + nodeValue + " is: "
				+ BSTNodeUtility.getBSTCeilNode(treeNode, nodeValue).getValue());

		// Find the Floor BST Node
		System.out.println("Floor BST Node of " + nodeValue + " is: "
				+ BSTNodeUtility.getBSTFloorNode(treeNode, nodeValue).getValue());

		// Search BST Node
		TreeNode<Integer> bstNode = BSTNodeUtility.searchBSTNode(treeNode, nodeValue);
		System.out.println("Does BST Node " + nodeValue + " exists?: " + (bstNode != null ? "Yes" : "No"));

		// Insert BST Node 17
		BSTManipulateUtility.insertBSTNodes(treeNode, 17);
		System.out.println(BSTTraversalUtility.getLevelOrderRepr(treeNode));

		// PreOrder Traversal
		System.out.println("PreOrder list: " + BSTTraversalUtility.getPreOrderRepr(treeNode));

		List<Integer> preOrderList = List.of(8, 5, 1, 7, 10, 12);
		TreeNode<Integer> treeNodeTwo = BSTConstructUtility.constructBSTFromPreOrder(preOrderList);
		System.out.println("Level Order list: " + BSTTraversalUtility.getLevelOrderRepr(treeNodeTwo));

		// Find the BST successor node.
		System.out.println("Successor BST Node of " + nodeValue + " is: "
				+ BSTNodeUtility.getBSTSuccessorNode(treeNode, nodeValue).getValue());

		// Find the BST predecessor node.
		System.out.println("Predecessor BST Node of " + nodeValue + " is: "
				+ BSTNodeUtility.getBSTPredecessorNode(treeNode, nodeValue).getValue());
	}

	public static TreeNode<Integer> createBST(int numberOfNodes, int minNumAllowed, int maxNumAllowed) {
		var bstAPI = new BinarySearchTree();
		bstAPI.createBST(numberOfNodes, minNumAllowed, maxNumAllowed);
		return bstAPI.getRootNode();
	}
}
