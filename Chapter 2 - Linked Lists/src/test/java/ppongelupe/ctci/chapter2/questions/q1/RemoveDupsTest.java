package ppongelupe.ctci.chapter2.questions.q1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ppongelupe.ctci.chapter2.Node;

class RemoveDupsTest {
	
	private Queue<String> queue;
	
	private Node head;

	@BeforeEach
	void setUp() throws Exception {
		head = new Node("a1");
		var p = head;
		var l = List.of("a2", "a1", "a3", "b1", "a2", "a3");
		for (String e : l) {
			p.next = new Node(e);
			p = p.next;
		}
		
		queue = new LinkedList<>(List.of("a1", "a2", "a3", "b1"));
	}

	@Test
	void testRemoveDuplicates() {
		var target = new RemoveDups();
		var withoutDups = target.removeDuplicates(head);
		
		while(withoutDups != null) {
			var expectedData = queue.poll();
			assertEquals(expectedData, withoutDups.data);
			withoutDups = withoutDups.next;
		}
		
	}
	
	@Test
	void testRemoveDuplicatesFollowUp() {
		var target = new RemoveDupsFollowUp();
		var withoutDups = target.removeDuplicates(head);
		
		while(withoutDups != null) {
			var expectedData = queue.poll();
			assertEquals(expectedData, withoutDups.data);
			withoutDups = withoutDups.next;
		}
		
	}

}
