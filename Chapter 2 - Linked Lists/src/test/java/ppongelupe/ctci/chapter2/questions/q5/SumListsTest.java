package ppongelupe.ctci.chapter2.questions.q5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ppongelupe.ctci.chapter2.Node;

class SumListsTest {
	
	private SumLists target;
	
	private Node<Integer> n1;

	private Node<Integer> n2;
	
	@BeforeEach
	public void setup() {
		n1 = prepareList(List.of(7, 1, 6));
		n2 = prepareList(List.of(4, 9, 2));
	}

	private Node<Integer> prepareList(List<Integer> list) {
		var l = new Node<>(-1);
		var p = l;
		
		for (Integer i : list) {
			p.next = new Node<Integer>(i);
			p = p.next;
		}
		
		return l.next;
	}

	@Test
	void testReversed() {
		target = new SumLists();
		
		var n3 = target.sumLists(n1, n2);
		
		Queue<Integer> queue = new LinkedList<>(
				List.of(1, 1, 9));
		while(n3 != null) {
			var expectedData = queue.poll();
			assertEquals(expectedData, n3.data);
			n3 = n3.next;
		}
	}
	
	@Test
	void testUnreversed() {
		target = new SumListsFollowUp();
		
		var n3 = target.sumLists(n1, n2);
		
		Queue<Integer> queue = new LinkedList<>(
				List.of(1, 2, 0, 8));
		while(n3 != null) {
			var expectedData = queue.poll();
			assertEquals(expectedData, n3.data);
			n3 = n3.next;
		}
	}

}
