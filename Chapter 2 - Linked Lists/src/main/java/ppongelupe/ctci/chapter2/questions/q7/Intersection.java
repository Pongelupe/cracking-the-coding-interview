package ppongelupe.ctci.chapter2.questions.q7;

import ppongelupe.ctci.chapter2.Node;

/**
 * 
 * 2.7 <b>Intersection</b>: Given two (singly) linked list, determine if the two
 * lists intersect. Return the intersecting node. Note that the intersection is
 * defined based on the reference, not value. That is, if the Kth node of the
 * first linked list is the exact same node (by reference) as the Jth node of
 * the second linked list, then they are intersecting.
 * 
 * 
 * @author ppongelupe
 */
public class Intersection {

	/**
	 * The time complexity is quadratic, <i>O(n²)</i>. The key idea is to iterate
	 * over all elements looking for the intersection, brute force approach. This
	 * solution is suboptimal. One better approach (<i>O(2n)</i>) would be to store
	 * the nodes in an hashed structure (Map/Set) and find the first duplicated 
	 * element, if present, which is the intersection.
	 * 
	 * @param <T>
	 * @param head1 The first singly linked list
	 * @param head2 The second singly linked list
	 * @return the intersecting node, null otherwise.
	 */
	public <T> Node<T> intersection(Node<T> head1, Node<T> head2) {
		Node<T> intersection = null;

		while (head1 != null && intersection == null) {
			var p = head2;
			while (p != null) {
				if (p == head1) {
					intersection = head1;
					p = null;
				} else {
					p = p.next;
				}
			}
			head1 = head1.next;
		}
		return intersection;
	}

}
