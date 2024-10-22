package ppongelupe.ctci.chapter2.questions.q1;

import java.util.HashSet;

import ppongelupe.ctci.chapter2.Node;

/**
 * 2.1 <b>Remove Dups</b>: Write code to remove duplicates from an unsorted
 * linked list.
 * 
 * 
 * @author ppongelupe
 */
public class RemoveDups {

	/**
	 * The time complexity of this implementation is linear, <i>O(n)</i>. The key
	 * idea is to store all the unique values into a set while iterating over the
	 * linked list. Two pointers are needed, one for the current node and the other
	 * to the previous node. If the value of the current node is present in the set,
	 * the node is deleted (the previous node next node points to the current node
	 * next node).
	 * 
	 * <br>
	 * <br>
	 * 
	 * The space complexity is linear, <i>O(n)</i>, due to the values stored in the
	 * set.
	 * 
	 * @param head The head of an unsorted linked list
	 * @return A linked list without the duplicated elements
	 */
	public Node removeDuplicates(Node head) {
		var set = new HashSet<String>();
		Node formerNode = null;
		var p = head;

		while (p != null) {
			if (set.contains(p.data)) {
				formerNode.next = p.next;
			} else {
				set.add(p.data);
				formerNode = p;
			}
			p = p.next;
		}

		return head;
	}
}
