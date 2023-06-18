package dev.gourab.nonlinear.dsa.trees.model.constructContract;

import java.util.List;

import dev.gourab.nonlinear.dsa.trees.model.TreeNode;

public interface ConstructBSTFunc<T> {
	TreeNode<T> constructBST(List<T> dfsOrderList);
}
