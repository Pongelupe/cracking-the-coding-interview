package ppongelupe.ctci.chapter2.tips;

import ppongelupe.ctci.chapter2.Node;

/**
 * Iterate through the linked list with <b>two pointers simultaneously</b>, with
 * one ahead of the other. The <i>"fast" node</i> might be ahead by a fixed
 * amount, or it might be hopping multiple nodes for each one node that the
 * <i>"slow" node</i> iterates through.
 * 
 * @author ppongelupe
 */
public class RunnerTechnique {
	
	/**
	 * This example shows the technique for the following exercise: <br>
	 * Suppose you had a linked list
	 * <code>a_1 -> a_2 -> ... -> a_n -> b_1 -> b_2 -> ... -> b_n</code> and you
	 * need to rearrange it into
	 * <code>a_1 -> b_1 -> a_2 -> b_2 -> ... -> a_n -> b_n</code>. You do not know
	 * the length of the linked list (but you do know that the length is an
	 * <b>even</b> number).
	 * 
	 * <br>
	 * <br>
	 * 
	 * You could have one pointer <i>p1</i> (the fast pointer) move every two
	 * elements for every one move that <i>p2</i> makes. When <i>p1</i> hits the end
	 * of the linked list, <i>p2</i> will be at the midpoint. Then, move <i>p1</i>
	 * back to the front and begin "weaving" the elements. On each iteration,
	 * <i>p2</i> selects an element and inserts it after <i>p1</i>.
	 * 
	 * @param head The head of a linked list
	 * @return Rearranged linked list head
	 */
	public Node<String> arrange(Node<String> head) {
		var n = 0;
		var fastPointer = head;
		var slowPointer = head;

		while (fastPointer != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			n++;
		}

		var response = new Node<String>(null);
		fastPointer = response;

		for (int i = 0; i < n; i++) {
			fastPointer.next = new Node<>(head.data);
			fastPointer.next.next = new Node<>(slowPointer.data);
			head = head.next;
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}

		return response.next;
	}
}
