package dev.gourab.nonlinear.dsa.trees.model.bstManipulateContract;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;

public interface BSTManipulationFunc<T> {
	void manipulateBSTNode(TreeNode<T> rootNode, T nodeValue);
}
