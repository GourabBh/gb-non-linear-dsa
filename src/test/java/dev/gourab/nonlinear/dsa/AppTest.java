package dev.gourab.nonlinear.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;
import dev.gourab.nonlinear.dsa.trees.utility.BSTManipulateUtility;
import dev.gourab.nonlinear.dsa.trees.utility.BSTTraversalUtility;

public class AppTest {
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	public void shouldMatch() {
		TreeNode<Integer> rootNode = App.createBST(20, 0, 20);
		assertEquals(20, BSTTraversalUtility.getInOrderRepr(rootNode).size());
	}

	@Test
	public void checkWhetherNodeInsertedExists() {
		int nodeValue = 17;
		TreeNode<Integer> rootNode = App.createBST(16, 0, 20);
		BSTManipulateUtility.insertBSTNodes(rootNode, nodeValue);
		List<Integer> inOrderList = BSTTraversalUtility.getInOrderRepr(rootNode);
		assertTrue(inOrderList.contains(nodeValue));
	}
}
