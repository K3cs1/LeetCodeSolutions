package valid_palindrome_125;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	private Solution vp;

	@BeforeEach
	void setUp() {
		vp = new Solution();
	}

	@Test
	void emptyStringIsPalindrome() {
		assertTrue( vp.isPalindrome( "" ), "An empty string should be a palindrome" );
	}

	@Test
	void singleCharacterIsPalindrome() {
		assertTrue( vp.isPalindrome( "a" ), "A single character should be a palindrome" );
	}

	@Test
	void phraseWithPunctuationIsPalindrome() {
		assertTrue( vp.isPalindrome( "A man, a plan, a canal: Panama" ), "Should be a palindrome, ignoring spaces and case" );
	}

	@Test
	void simplePalindromeIsPalindrome() {
		assertTrue( vp.isPalindrome( "racecar" ), "'racecar' is a palindrome" );
	}

	@Test
	void helloIsNotPalindrome() {
		assertFalse( vp.isPalindrome( "hello" ), "'hello' is not a palindrome" );
	}

	@Test
	void nonPalindromePhraseIsNotPalindrome() {
		assertFalse( vp.isPalindrome( "Not a palindrome" ), "This is clearly not a palindrome" );
	}

}
