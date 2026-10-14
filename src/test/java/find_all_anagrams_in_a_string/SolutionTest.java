package find_all_anagrams_in_a_string;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void testMultipleMatches() {
		assertEquals( List.of( 0, 6 ), Solution.findAllAnagrams( "cbaebabacd", "abc" ) );
	}

	@Test
	void testOverlappingMatches() {
		assertEquals( List.of( 0, 1, 2 ), Solution.findAllAnagrams( "abab", "ab" ) );
	}

	@Test
	void testNoMatch() {
		assertEquals( List.of(), Solution.findAllAnagrams( "abcdef", "xyz" ) );
	}

	@Test
	void testCheckLongerThanOriginal() {
		assertEquals( List.of(), Solution.findAllAnagrams( "ab", "abc" ) );
	}

	@Test
	void testEqualStrings() {
		assertEquals( List.of( 0 ), Solution.findAllAnagrams( "abc", "abc" ) );
	}

	@Test
	void testEqualLengthAnagram() {
		assertEquals( List.of( 0 ), Solution.findAllAnagrams( "cba", "abc" ) );
	}

	@Test
	void testSingleCharacter() {
		assertEquals( List.of( 0, 2 ), Solution.findAllAnagrams( "aba", "a" ) );
	}

	@Test
	void testRepeatedCharactersInCheck() {
		assertEquals( List.of( 0, 1, 2, 3 ), Solution.findAllAnagrams( "aabaab", "aab" ) );
	}

	@Test
	void testCountsMustMatchExactly() {
		// "aab" window must not match "abb"
		assertEquals( List.of(), Solution.findAllAnagrams( "aaaa", "abb" ) );
	}

	@Test
	void testMatchAtEnd() {
		assertEquals( List.of( 3 ), Solution.findAllAnagrams( "xyzabc", "cab" ) );
	}
}
