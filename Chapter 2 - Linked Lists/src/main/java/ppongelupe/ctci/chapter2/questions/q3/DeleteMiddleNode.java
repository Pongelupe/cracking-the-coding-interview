package ppongelupe.ctci.chapter2.questions.q3;

import ppongelupe.ctci.chapter2.Node;

/**
 * 2.3 <b>Delete Middle Node</b>: Implement an algorithm to delete a node in the
 * middle (i.e., any node but the first and the last node, not necessarily the
 * exact middle) of a singly linked list, given only access to that node.
 * 
 * @author ppongelupe
 */
public class DeleteMiddleNode {

	/**
	 * The time and space complexity are constant, <i>O(1)</i>. The key idea is to
	 * alter the given node with the values of the following node of the linked
	 * list.
	 * 
	 * @param node A node in the middle of a singly linked list
	 * @return
	 */
	public boolean deleteMiddleNode(Node<String> node) {
		if (node.next == null) return false;

		node.data = node.next.data;
		node.next = node.next.next;

		return true;
	}

}
