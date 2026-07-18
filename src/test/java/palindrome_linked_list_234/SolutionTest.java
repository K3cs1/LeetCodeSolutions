package palindrome_linked_list_234;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private final Solution palindromeLinkedList = new Solution();

	@Test
	void testIsPalindromeEvenLengthTrue() {
		Solution.ListNode head = new Solution.ListNode(1,
				new Solution.ListNode(2,
						new Solution.ListNode(2,
								new Solution.ListNode(1))));
		assertTrue(palindromeLinkedList.isPalindrome(head));
	}

	@Test
	void testIsPalindromeOddLengthTrue() {
		Solution.ListNode head = new Solution.ListNode(1,
				new Solution.ListNode(2,
						new Solution.ListNode(1)));
		assertTrue(palindromeLinkedList.isPalindrome(head));
	}

	@Test
	void testIsPalindromeSingleElement() {
		Solution.ListNode head = new Solution.ListNode(1);
		assertTrue(palindromeLinkedList.isPalindrome(head));
	}

	@Test
	void testIsNotPalindrome() {
		Solution.ListNode head = new Solution.ListNode(1, new Solution.ListNode(2));
		assertFalse(palindromeLinkedList.isPalindrome(head));
	}

	@Test
	void testIsPalindromeEmptyList() {
		assertTrue(palindromeLinkedList.isPalindrome(null));
	}
}