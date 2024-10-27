package ppongelupe.ctci.chapter2.tips;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ppongelupe.ctci.chapter2.Node;

/**
 * @author ppongelupe
 */
class RunnerTechniqueTest {
	
	private RunnerTechnique target;
	
	private Node<String> head;

	@BeforeEach
	void setUp() throws Exception {
		target = new RunnerTechnique();
		head = new Node<>("a1");
		var p = head;
		var l = List.of("a2", "a3", "b1", "b2", "b3");
		for (String e : l) {
			p.next = new Node<>(e);
			p = p.next;
		}
	}

	@Test
	void testArrange() {
		var rearranged = target.arrange(head);
		
		Queue<String> queue = new LinkedList<>(List.of("a1", "b1", "a2", "b2", "a3", "b3"));
		while(rearranged != null) {
			var expectedData = queue.poll();
			assertEquals(expectedData, rearranged.data);
			rearranged = rearranged.next;
		}
	}

}
