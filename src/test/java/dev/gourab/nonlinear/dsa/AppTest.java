package dev.gourab.nonlinear.dsa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import dev.gourab.nonlinear.dsa.trees.model.BinarySearchTree;
import dev.gourab.nonlinear.dsa.trees.utility.BSTTraversalUtility;

public class AppTest {
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	public void shouldMatch() {
		var bstAPI = new BinarySearchTree();
		bstAPI.createBST(15, 0, 20);
		assertEquals(15, BSTTraversalUtility.getInOrderRepr(bstAPI.getRootNode()).size());
	}
}
