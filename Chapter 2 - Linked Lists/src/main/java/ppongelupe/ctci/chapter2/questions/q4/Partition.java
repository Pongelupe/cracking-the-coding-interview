package ppongelupe.ctci.chapter2.questions.q4;

import ppongelupe.ctci.chapter2.Node;

/**
 * 2.4 <b>Partition</b>: Write a code to partition a linked list around a value
 * <i>x</i>, such that all nodes less than <i>x</i> come before all nodes
 * greater than or equal to <i>x</i>. If <i>x</i> is contained within the list,
 * the values of <i>x</i> only need to be after the elements less than <i>x</i>
 * (see example). The partition element <i>x</i> can appear anywhere in the
 * "right partition"; it does not need to appear between the left and right
 * partitions.
 * 
 * <br>
 * <br>
 * 
 * EXAMPLE:<br>
 * <b>INPUT</b>: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 <br>
 * <b>OUTPUT</b>: 3 -> 1 -> 2 ->
 * 10 -> 5 -> 5 -> 8
 * 
 * @author ppongelupe
 */
public class Partition {

	/**
	 * The time and space complexity are linear, <i>O(n)</i>. The key idea is to
	 * iterate over elements just once. For each iteration, we compare the element
	 * data with {@code partition}, if the value is lower than {@code partition},
	 * the pointer is assigned to the left partition, the pointer is assigned to the
	 * right partition otherwise. Finally, the right and left partitions are merged
	 * and returned.
	 * 
	 * @param head      The head of a singly linked list
	 * @param partition The partition value
	 * @return
	 */
	public Node<Integer> partition(Node<Integer> head, int partition) {
		var left = new Node<>(-1);
		var initLeft = left;

		var right = new Node<>(-1);
		var initRight = right;

		var pointer = head;
		while (pointer != null) {
			if (pointer.data < partition) {
				left.next = new Node<>(pointer.data);
				left = left.next;
			} else {
				right.next = new Node<>(pointer.data);
				right = right.next;
			}
			pointer = pointer.next;
		}

		var response = initLeft.next != null ? initLeft.next : initRight.next;
		if (initLeft != null)	left.next = initRight.next;

		return response;
	}

}
