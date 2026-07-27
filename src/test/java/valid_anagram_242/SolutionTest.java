package valid_anagram_242;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	private Solution solution;

	@BeforeEach
	void setUp() {
		this.solution = new Solution();
	}

	@Test
	void testSimpleAnagram() {
		assertTrue( solution.isAnagram( "anagram", "nagaram" ) );
	}

	@Test
	void testSimpleNonAnagram() {
		assertFalse( solution.isAnagram( "rat", "car" ) );
	}

	@Test
	void testBothEmptyStrings() {
		assertTrue( solution.isAnagram( "", "" ) );
	}

	@Test
	void testSingleCharacterAnagram() {
		assertTrue( solution.isAnagram( "a", "a" ) );
	}

	@Test
	void testSingleCharacterNonAnagram() {
		assertFalse( solution.isAnagram( "a", "b" ) );
	}

	@Test
	void testDifferentLengths() {
		assertFalse( solution.isAnagram( "ab", "abc" ) );
	}

	@Test
	void testRepeatedCharacters() {
		assertTrue( solution.isAnagram( "aab", "aba" ) );
	}

	@Test
	void testRepeatedCharactersNonAnagram() {
		assertFalse( solution.isAnagram( "aab", "abb" ) );
	}

	@Test
	void testAllSameCharacter() {
		assertTrue( solution.isAnagram( "aaaa", "aaaa" ) );
	}

	@Test
	void testLongerStrings() {
		assertTrue( solution.isAnagram( "listen", "silent" ) );
	}

	@Test
	void testLongerStringsNonAnagram() {
		assertFalse( solution.isAnagram( "hello", "world" ) );
	}

	@Test
	void testOneEmptyOneNot() {
		assertFalse( solution.isAnagram( "", "a" ) );
	}

	@Test
	void testOneEmptyOneNotReverse() {
		assertFalse( solution.isAnagram( "a", "" ) );
	}

	@Test
	void testSpecialCharacters() {
		assertTrue( solution.isAnagram( "a1b2", "2b1a" ) );
	}

	@Test
	void testMultipleRepeatedCharacters() {
		assertTrue( solution.isAnagram( "aabbcc", "abcabc" ) );
	}

}
