package ppongelupe.ctci.chapter4.tips;

import java.util.function.Consumer;

import ppongelupe.ctci.chapter4.BinaryTreeNode;

/**
 * 
 * @param <T>
 * @author ppongelupe
 */
public class BinaryTreeTraversal<T extends Comparable<T>> {

	public void inOrderTraversal(BinaryTreeNode<T> node, Consumer<BinaryTreeNode<T>> visit) {
		if (node != null) {
			inOrderTraversal(node.left, visit);
			visit.accept(node);
			inOrderTraversal(node.right, visit);
		}
	}
	
	public void preOrderTraversal(BinaryTreeNode<T> node, Consumer<BinaryTreeNode<T>> visit) {
		if (node != null) {
			visit.accept(node);
			preOrderTraversal(node.left, visit);
			preOrderTraversal(node.right, visit);
		}
	}
	
	public void postOrderTraversal(BinaryTreeNode<T> node, Consumer<BinaryTreeNode<T>> visit) {
		if (node != null) {
			postOrderTraversal(node.left, visit);
			postOrderTraversal(node.right, visit);
			visit.accept(node);
		}
	}

}
