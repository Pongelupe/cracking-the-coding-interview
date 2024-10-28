package ppongelupe.ctci.chapter2.questions.q7;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ppongelupe.ctci.chapter2.Node;

class IntersectionTest {

	private Intersection target;
	
	private Node<String> head1;

	private Node<String> head2;
	
	@BeforeEach
	void setUp() throws Exception {
		target = new Intersection();
	}
	
	private Node<String> linkedListFromList(List<String> l) {
		var head = new Node<String>(null);
		var p = head;
		for (String e : l) {
			p.next = new Node<>(e);
			p = p.next;
		}
		
		return head.next;
	}

	@Test
	void testIntersectionWithout() {
		head1 = linkedListFromList(List.of("1", "9", "9", "8"));
		head2 = linkedListFromList(List.of("1", "9", "9", "8"));
		
		assertNull(target.intersection(head1, head2));
		
	}
	
	@Test
	void testIntersectionWith() {
		head1 = linkedListFromList(List.of("1", "9", "9", "8"));
		head2 = linkedListFromList(List.of("1", "9", "9", "2"));
		
		head2.next = head1.next.next;
		
		var intersection = target.intersection(head1, head2);
		assertNotNull(intersection);
		assertEquals("9", intersection.data);
		
	}

}
