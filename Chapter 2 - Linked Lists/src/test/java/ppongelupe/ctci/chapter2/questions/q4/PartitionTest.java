package ppongelupe.ctci.chapter2.questions.q4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ppongelupe.ctci.chapter2.Node;

class PartitionTest {

	private Partition target;
	
	private Node<Integer> head;
	
	@BeforeEach
	void setUp() throws Exception {
		target = new Partition();
		head = new Node<>(3);
		var p = head;
		var l = List.of(5, 8, 5, 10, 2, 1);
		for (var e : l) {
			p.next = new Node<>(e);
			p = p.next;
		}
	}

	@Test
	void test() {
		var partitioned = target.partition(head, 5);
		
		assertNotNull(partitioned);
		
		Queue<Integer> queue = new LinkedList<>(
				List.of(3, 2, 1, 5, 8, 5, 10));
		while(partitioned != null) {
			var expectedData = queue.poll();
			assertEquals(expectedData, partitioned.data);
			partitioned = partitioned.next;
		}
	}

}
