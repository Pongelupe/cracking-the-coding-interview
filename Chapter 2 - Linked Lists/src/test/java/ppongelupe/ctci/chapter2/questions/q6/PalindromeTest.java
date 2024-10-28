package ppongelupe.ctci.chapter2.questions.q6;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ppongelupe.ctci.chapter2.Node;

class PalindromeTest {
	
	private Palindrome target;
	
	private Node<String> head;

	@BeforeEach
	void setUp() throws Exception {
		target = new Palindrome();
	}

	@Test
	void testIsPalindromeFalse() {
		head = new Node<>("a1");
		var p = head;
		var l = List.of("a2", "a1", "a3", "b1", "a2", "a3");
		for (String e : l) {
			p.next = new Node<>(e);
			p = p.next;
		}
		
		assertFalse(target.isPalindrome(head));
	}
	
	@Test
	void testIsPalindromeTrue() {
		head = new Node<>("a");
		var p = head;
		var l = List.of("r", "a", "r", "a");
		for (String e : l) {
			p.next = new Node<>(e);
			p = p.next;
		}
		
		assertTrue(target.isPalindrome(head));
	}

}
