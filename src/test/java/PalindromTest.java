import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromTest {

	@Test
	void isPalindromeWithStringBuffer() {
     assertFalse(Palindrom.isPalindromeWithStringBuffer("Testtse"));
     assertTrue(Palindrom.isPalindromeWithStringBuffer("TesttseT"));
	}

	@Test
	void isPalindromeWithString() {
		assertFalse(Palindrom.isPalindromeWithString("Testtse"));
		assertTrue(Palindrom.isPalindromeWithString("TesttseT"));
		assertTrue(Palindrom.isPalindromeWithString("TestAtseT"));
	}

	@Test
	void isPalindromeWithLinkedList() {
		assertFalse(Palindrom.isPalindromWithLinkedList(createLinkedList("Testtse")));
		assertTrue(Palindrom.isPalindromWithLinkedList(createLinkedList("TesttseT")));
		assertTrue(Palindrom.isPalindromWithLinkedList(createLinkedList("TestAtseT")));
	}

	private Palindrom.Node createLinkedList(final String text) {
		return createLinkedList(null, text);
	}

	private Palindrom.Node createLinkedList(final Palindrom.Node node, final String text) {
		Palindrom.Node prevNode = new Palindrom.Node();
		prevNode.value = text.charAt(text.length() - 1);
		prevNode.next = node;
		if (text.length() == 1) {
			return prevNode;
		}
		return createLinkedList(prevNode, text.substring(0, text.length() - 1));
	}
}
