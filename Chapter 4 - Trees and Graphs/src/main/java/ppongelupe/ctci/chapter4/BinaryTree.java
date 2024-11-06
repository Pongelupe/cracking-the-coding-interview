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
	
	public BinaryTreeNode<T> insert(BinaryTreeNode<T> node) {
		if (root == null) {
			this.root = node;
			return root;
		}
		else {
			return insert(node, root);
		}
	}
	

	private BinaryTreeNode<T> insert(BinaryTreeNode<T> node, BinaryTreeNode<T> parentNode) {
		if (parentNode == null) return node;
		if (node.data.compareTo(parentNode.data) < 0) {
			parentNode.left = insert(node, parentNode.left);
		} else {
			parentNode.right = insert(node, parentNode.right);
		}
		
		return parentNode;
	}
	
}
