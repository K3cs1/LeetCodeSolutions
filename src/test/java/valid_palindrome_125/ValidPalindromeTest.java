package valid_palindrome_125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void testIsPalindrome() {
        ValidPalindrome vp = new ValidPalindrome();

        // Test with empty string
        assertTrue(vp.isPalindrome(""), "An empty string should be a palindrome");

        // Test with single character
        assertTrue(vp.isPalindrome("a"), "A single character should be a palindrome");

        // Test with valid palindromes
        assertTrue(vp.isPalindrome("A man, a plan, a canal: Panama"), "Should be a palindrome, ignoring spaces and case");
        assertTrue(vp.isPalindrome("racecar"), "'racecar' is a palindrome");

        // Test with non-palindromes
        assertFalse(vp.isPalindrome("hello"), "'hello' is not a palindrome");
        assertFalse(vp.isPalindrome("Not a palindrome"), "This is clearly not a palindrome");
    }

}
