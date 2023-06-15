package dev.gourab.nonlinear.dsa;

import java.util.List;

import dev.gourab.nonlinear.dsa.trees.model.BinarySearchTree;
import dev.gourab.nonlinear.dsa.trees.model.TreeNode;
import dev.gourab.nonlinear.dsa.trees.utility.BSTNodeUtility;
import dev.gourab.nonlinear.dsa.trees.utility.BSTTraversalUtility;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		// Creating a BST.
		var bstAPI = new BinarySearchTree();
		bstAPI.createBST(15, 0, 20);
		TreeNode<Integer> treeNode = bstAPI.getRootNode();
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
	}
}
