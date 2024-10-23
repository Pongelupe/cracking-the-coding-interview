package ppongelupe.ctci.chapter2.questions.q2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ppongelupe.ctci.chapter2.Node;

class ReturnKthToLastTest {
	
	private ReturnKthToLast target;
	
	private Node head;

	@BeforeEach
	void setUp() throws Exception {
		target = new ReturnKthToLast();
		head = new Node("a1");
		var p = head;
		var l = List.of("a2", "a1", "a3", "b1", "a2", "a3");
		for (String e : l) {
			p.next = new Node(e);
			p = p.next;
		}
	}

	@Test
	void testFindKthToLast() {
		var kthToLast = target.findKthToLast(head, 2);
		
		assertEquals("a2", kthToLast.data);
	}

}
