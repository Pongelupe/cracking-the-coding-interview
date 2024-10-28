package ppongelupe.ctci.chapter2.questions.q6;

import java.util.Stack;

import ppongelupe.ctci.chapter2.Node;

/**
 * 2.6 <b>Palindrome</b>: Implement a function to check if a linked list is a
 * palindrome.
 * 
 * 
 * @author ppongelupe
 */
public class Palindrome {

	/**
	 * The time and space complexities are linear, <i>O(2n)</i> for time and
	 * <i>O(n)</i> for space. The idea is to push all elements to a stack
	 * (<i>O(n)</i>), then pop elements comparing with the linked list.
	 * 
	 * @param <T>
	 * @param head
	 * @return
	 */
	public <T> boolean isPalindrome(Node<T> head) {
		if (head.next == null)
			return false;

		var p = head;
		var stack = new Stack<T>();

		while (p != null) {
			stack.push(p.data);
			p = p.next;
		}

		while (head != null) {
			if (!head.data.equals(stack.pop()))
				return false;
			head = head.next;
		}

		return true;
	}

}
