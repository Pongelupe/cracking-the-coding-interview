package ppongelupe.ctci.chapter2;

/**
 * @author ppongelupe
 */
public class Node<T> {

	public Node<T> next = null;
	
	public T data;

	public Node(T data) {
		this.data = data;
	}
	
}
