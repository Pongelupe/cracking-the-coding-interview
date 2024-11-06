package ppongelupe.ctci.chapter4.tips;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ppongelupe.ctci.chapter4.BinaryTree;

class BinaryTreeTraversalTest {

	private BinaryTreeTraversal<Integer> target;

	private BinaryTree<Integer> tree;

	@BeforeEach
	void setUp() throws Exception {
		this.tree = new BinaryTree<>();
		this.tree.insert(10, 5, 20, 9, 18, 3, 21);
		this.target = new BinaryTreeTraversal<>();
	}

	@Test
	void testInOrderTraversal() {
		Queue<Integer> queue = 
				new LinkedList<>(List.of(3, 5, 9, 10, 18, 20, 21));

		target.inOrderTraversal(tree.root, 
				n -> assertEquals(queue.poll(), n.data));
		
		assertTrue(queue.isEmpty());
	}

	@Test
	void testPreOrderTraversal() {
		Queue<Integer> queue = 
				new LinkedList<>(List.of(10, 5, 3, 9, 20, 18, 21));

		target.preOrderTraversal(tree.root, 
				n -> assertEquals(queue.poll(), n.data));
		
		assertTrue(queue.isEmpty());
	}

	@Test
	void testPostOrderTraversal() {
		Queue<Integer> queue = 
				new LinkedList<>(List.of(3, 9, 5, 18, 21, 20, 10));

		target.postOrderTraversal(tree.root, 
				n -> assertEquals(queue.poll(), n.data));
		
		assertTrue(queue.isEmpty());
	}

}
