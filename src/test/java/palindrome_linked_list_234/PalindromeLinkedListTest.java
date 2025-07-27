package palindrome_linked_list_234;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeLinkedListTest {

    private final PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    void testIsPalindromeEvenLengthTrue() {
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1,
                new PalindromeLinkedList.ListNode(2,
                        new PalindromeLinkedList.ListNode(2,
                                new PalindromeLinkedList.ListNode(1))));
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void testIsPalindromeOddLengthTrue() {
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1,
                new PalindromeLinkedList.ListNode(2,
                        new PalindromeLinkedList.ListNode(1)));
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void testIsPalindromeSingleElement() {
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1);
        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void testIsNotPalindrome() {
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1, new PalindromeLinkedList.ListNode(2));
        assertFalse(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void testIsPalindromeEmptyList() {
        assertTrue(palindromeLinkedList.isPalindrome(null));
    }
}