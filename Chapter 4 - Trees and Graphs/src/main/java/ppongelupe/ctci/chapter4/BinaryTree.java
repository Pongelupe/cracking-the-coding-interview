package ppongelupe.ctci.chapter4;

/**
 * 
 * @author ppongelupe
 */
public class BinaryTree<T extends Comparable<T>> {

	public BinaryTreeNode<T> root;
	
	@SuppressWarnings("unchecked")
	public void insert(T... values) {
		for (var node : values) {
			insert(new BinaryTreeNode<>(node));
		}
	}
	
	public void insert(BinaryTreeNode<T> node) {
		if (root == null) this.root = node;
		else {
			insert(node, root);
		}
	}

	private void insert(BinaryTreeNode<T> node, BinaryTreeNode<T> parentNode) {
		if (parentNode.left == null) {}
	}
	
}
