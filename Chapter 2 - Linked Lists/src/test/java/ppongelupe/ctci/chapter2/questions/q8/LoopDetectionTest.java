package ppongelupe.ctci.chapter2.questions.q8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ppongelupe.ctci.chapter2.Node;

class LoopDetectionTest {
	
	private LoopDetection target;
	
	private Node<String> head;

	@BeforeEach
	void setUp() throws Exception {
		target = new LoopDetection();
		head = new Node<>("A");
		var l = List.of("B", "C", "D", "E");
		var p = head;
		for (String e : l) {
			p.next = new Node<>(e);
			p = p.next;
		}
		
		p.next = head.next.next;
	}
	

	@Test
	void test() {
		var intersection = target.detectLoopingNode(head);
		assertEquals("C", intersection.data);
	}

}
