package ppongelupe.ctci.chapter2.questions.q3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ppongelupe.ctci.chapter2.Node;

class DeleteMiddleNodeTest {
	
	private DeleteMiddleNode target;
	
	private Node head;
	
	private Map<String, Node> nodeMap;
	
	private Queue<String> queue;

	@BeforeEach
	void setUp() throws Exception {
		target = new DeleteMiddleNode();
		head = new Node("a1");
		nodeMap = new HashMap<>();
		var p = head;
		var l = List.of("a2", "a3", "b1", "b2", "b3");
		for (String e : l) {
			var node = new Node(e);
			p.next = node;
			p = p.next;
			nodeMap.put(e, node);
		}
		
	}

	@Test
	@DisplayName("Valid deleting node")
	void testDeleteMiddleNodeValid() {
		queue = new LinkedList<>(List.of("a1", "a2", "a3", "b2", "b3"));
		
		target.deleteMiddleNode(nodeMap.get("b1"));

		var current = head;
		while(current != null) {
			assertEquals(queue.poll(), current.data);
			current = current.next;
		}
	}

	@Test
	@DisplayName("Invalid deleting node")
	void testDeleteMiddleNodeInvalid() {
		queue = new LinkedList<>(List.of("a1", "a2", "a3", "b1", "b2", "b3"));
		
		target.deleteMiddleNode(nodeMap.get("b3"));

		var current = head;
		while(current != null) {
			assertEquals(queue.poll(), current.data);
			current = current.next;
		}
	}
	
}
