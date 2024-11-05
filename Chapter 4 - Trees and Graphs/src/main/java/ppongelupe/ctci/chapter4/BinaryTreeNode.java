package ppongelupe.ctci.chapter4;

/**
 * 
 * @author ppongelupe
 */
public class BinaryTreeNode<T extends Comparable<T>> extends TreeNode<T> {

	public BinaryTreeNode<T> left;

	public BinaryTreeNode<T> right;
	
	
	public BinaryTreeNode(T data) {
		super(data);
	}

}
