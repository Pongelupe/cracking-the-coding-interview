package ppongelupe.ctci.chapter2.questions.q5;

import ppongelupe.ctci.chapter2.Node;

/**
 * 2.5 <b>Sum Lists</b>: You have two numbers represented by a linked list,
 * where each node contains a single digit. The digits are stored in a
 * <i>reverse order</i>, such that 1's digit is at the head of the list. Write a
 * function that adds the two numbers and returns the sum as linked list.
 * 
 * <br>
 * <br>
 * 
 * EXAMPLE<br>
 * <b>INPUT</b>: (7 -> 1 -> 6) + (5 -> 9 -> 2). That is, 617 + 295.<br>
 * <b>OUTPUT</b>: (2 -> 1 -> 9). That is, 912.
 * 
 * @author ppongelupe
 */
public class SumLists {

	/**
	 * 
	 * The time and space complexities are linear, <i>O(2n)</i>. The key idea is to
	 * retrieve each numbers and sum them. Finally, the linked list is generated and
	 * then returned.
	 * 
	 * @param n1 The first number as a linked list
	 * @param n2 The second number as a linked list
	 * @return The sum linked list
	 */
	public Node<Integer> sumLists(Node<Integer> n1, Node<Integer> n2) {
		var result = String.valueOf(getVal(n1) + getVal(n2));
		var sum = new Node<>(-1);
		var p = sum;

		for (int i = result.length() - 1; i > 0; i--) {
			p.next = new Node<Integer>(Integer.parseInt("" + result.charAt(i)));
			p = p.next;
		}

		return sum.next;
	}

	private int getVal(Node<Integer> head) {
		var sb = new StringBuilder();

		while (head != null) {
			sb.append(head.data);
			head = head.next;
		}

		return Integer.parseInt(sb.reverse().toString());
	}

}
