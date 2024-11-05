package ppongelupe.ctci.chapter4.tips;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ppongelupe.ctci.chapter4.BinaryTree;

class BinaryTreeTraversalTest {

	private BinaryTree<Integer> tree;
	
	@BeforeEach
	void setUp() throws Exception {
		this.tree = new BinaryTree<>();
		this.tree.insert(10, 5, 20, 9, 18, 3, 7);
	}

	@Test
	void testInOrderTraversal() {
		fail("Not yet implemented");
	}

	@Test
	void testPreOrderTraversal() {
		fail("Not yet implemented");
	}

	@Test
	void testPostOrderTraversal() {
		fail("Not yet implemented");
	}

}
