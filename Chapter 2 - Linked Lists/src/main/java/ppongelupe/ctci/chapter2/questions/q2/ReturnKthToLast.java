package ppongelupe.ctci.chapter2.questions.q2;

import ppongelupe.ctci.chapter2.Node;

/**
 * 2.2 <b>Return Kth to Last</b>: Implement an algorithm o find the Kth to last
 * element of singly linked list.
 * 
 * @author ppongelupe
 */
public class ReturnKthToLast {

	/**
	 * The time complexity of this implementation is linear, <i>O(2n)</i>. The
	 * implementation may be divided in two steps:
	 * <ol>
	 * <li>Getting the length of the linked list</li>
	 * <li>Iterate over the linked list one more time</li>
	 * </ol>
	 * 
	 * 
	 * @param head The head of a singly linked list
	 * @param k    the index to find. <b>It must be smaller than the length of the
	 *             linked list</b>
	 * @return
	 */
	public Node findKthToLast(Node head, int k) {
		var length = 0;
		var p = head;

		while (p != null) {
			length++;
			p = p.next;
		}
		
		p = head;
		var targetIndex = length - k;
		for (int i = 0; i < targetIndex; i++) {
			p = p.next;
		}

		return p;
	}

}
