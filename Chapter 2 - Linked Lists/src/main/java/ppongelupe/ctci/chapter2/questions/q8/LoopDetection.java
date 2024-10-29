package ppongelupe.ctci.chapter2.questions.q8;

import java.util.HashSet;

import ppongelupe.ctci.chapter2.Node;

/**
 * 2.8 <b>Loop Detection</b>: Given a circular linked list, implement an
 * algorithm that returns the node at the beginning of the loop. <br>
 * 
 * <b>DEFINITION</b>:<br>
 * Circular linked list: A (corrupt) linked list in which a node's next pointer
 * points to an earlier node, so as to make a loop in the linked list.
 * 
 * <br>
 * <br>
 * <b>Example:</b><br>
 * <b>INPUT</b>: A -> B -> C -> D -> E -> C [the same C as earlier]<br>
 * <b>OUTPUT</b>: C
 * 
 * 
 * @author ppongelupe
 */
public class LoopDetection {

	/**
	 * The time and space complexities are linear, <i>O(n)</i>. The idea is to use a
	 * set to store all visited nodes, the first reappearing node is the beginning
	 * of the loop.
	 * 
	 * @param <T>
	 * @param head
	 * @return
	 */
	public <T> Node<T> detectLoopingNode(Node<T> head) {
		Node<T> loopingNode = null;
		var set = new HashSet<Node<T>>();
		while (loopingNode == null) {
			if (set.contains(head)) {
				loopingNode = head;
			} else {
				set.add(head);
				head = head.next;
			}
		}
		return loopingNode;
	}

}
