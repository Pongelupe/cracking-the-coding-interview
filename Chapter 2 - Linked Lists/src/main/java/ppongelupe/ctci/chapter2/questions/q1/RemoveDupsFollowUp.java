package ppongelupe.ctci.chapter2.questions.q1;

import ppongelupe.ctci.chapter2.Node;

/**
 * 2.1 <b>Remove Dups</b>: Write code to remove duplicates from an unsorted
 * linked list.
 * <br>
 * <br>
 * 
 * FOLLOW UP: How would solve this problem if a temporary buffer is not allowed?
 * 
 * @author ppongelupe
 */
public class RemoveDupsFollowUp extends RemoveDups {

	/**
	 * The time complexity of this implementation is quadratic, <i>O(n²)</i>. Two
	 * pointers are needed, one for the current node and the other to the previous
	 * node. If the value of the current node is present in the linked list, the
	 * node is deleted (the previous node next node points to the current node next
	 * node).
	 * 
	 * <br>
	 * <br>
	 * 
	 * The space complexity is constant, <i>O(1)</i>.
	 * 
	 * @param head The head of an unsorted linked list
	 * @return A linked list without the duplicated elements
	 */
	@Override
	public Node<String> removeDuplicates(Node<String> head) {
		Node<String> formerNode = null;
		var p = head;

		while (p != null) {
			if (containsElement(head, formerNode, p.data)) {
				formerNode.next = p.next;
			} else {
				formerNode = p;
			}
			p = p.next;
		}

		return head;
	}

	/**
	 * Search if a given element has already appeared in the linked list. This
	 * method has a linear time complexity, <i>O(n)</i>.
	 * 
	 * @param head
	 * @param formerNode
	 * @param data
	 * @return
	 */
	private boolean containsElement(Node<String> head, Node<String> formerNode, String data) {
		if (formerNode == null) return false;
		while(head.next != null) {
			if (head.data.equals(formerNode.data)) return false;
			if (head.data.equals(data)) return true;
			head = head.next;
		}
		return false;
	}
}
