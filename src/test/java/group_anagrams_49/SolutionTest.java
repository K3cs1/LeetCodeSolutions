package group_anagrams_49;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution;

	@BeforeEach
	void setUp() {
		this.solution = new Solution();
	}

	@Test
	void testBasicAnagramGrouping() {
		String[] input = { "eat", "tea", "ate", "nat", "tan", "bat" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 3, result.size() );
		assertGroupContains( result, "eat", "tea", "ate" );
		assertGroupContains( result, "nat", "tan" );
		assertGroupContains( result, "bat" );
	}

	private void assertGroupContains( List<List<String>> groups, String... expectedStrings ) {
		Set<String> expectedSet = new HashSet<>( Arrays.asList( expectedStrings ) );

		for ( List<String> group : groups ) {
			Set<String> groupSet = new HashSet<>( group );
			if ( groupSet.equals( expectedSet ) ) {
				return;
			}
		}

		fail( "Expected group containing " + expectedSet + " not found in " + groups );
	}

	@Test
	void testEmptyArray() {
		String[] input = {};
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 0, result.size() );
	}

	@Test
	void testSingleString() {
		String[] input = { "listen" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 1, result.size() );
		assertEquals( 1, result.getFirst().size() );
		assertTrue( result.getFirst().contains( "listen" ) );
	}

	@Test
	void testAllIdenticalStrings() {
		String[] input = { "abc", "abc", "abc" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 1, result.size() );
		assertEquals( 3, result.getFirst().size() );
		assertTrue( result.getFirst().stream().allMatch( s -> s.equals( "abc" ) ) );
	}

	@Test
	void testNoAnagrams() {
		String[] input = { "abc", "def", "ghi" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 3, result.size() );
		for ( List<String> group : result ) {
			assertEquals( 1, group.size() );
		}
	}

	@Test
	void testSingleCharacterStrings() {
		String[] input = { "a", "b", "a", "c", "b" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 3, result.size() );
		assertGroupContains( result, "a", "a" );
		assertGroupContains( result, "b", "b" );
		assertGroupContains( result, "c" );
	}

	@Test
	void testEmptyStrings() {
		String[] input = { "", "", "a" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 2, result.size() );
		assertGroupContains( result, "", "" );
		assertGroupContains( result, "a" );
	}

	@Test
	void testMultipleAnagramGroups() {
		String[] input = { "listen", "silent", "hello", "world", "enlist" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 3, result.size() );
		assertGroupContains( result, "listen", "silent", "enlist" );
		assertGroupContains( result, "hello" );
		assertGroupContains( result, "world" );
	}

	@Test
	void testAllStringsAreAnagrams() {
		String[] input = { "abc", "bca", "cab", "acb", "bac", "cba" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 1, result.size() );
		assertEquals( 6, result.getFirst().size() );
		assertGroupContains( result, "abc", "bca", "cab", "acb", "bac", "cba" );
	}

	@Test
	void testWithDuplicateAnagrams() {
		String[] input = { "eat", "tea", "eat", "ate" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 1, result.size() );
		assertEquals( 4, result.getFirst().size() );
		assertGroupContains( result, "eat", "tea", "eat", "ate" );
	}

	@Test
	void testComplexMixedInput() {
		String[] input = { "ab", "ba", "abc", "bac", "cab", "xyz", "zyx", "x" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 4, result.size() );
		assertGroupContains( result, "ab", "ba" );
		assertGroupContains( result, "abc", "bac", "cab" );
		assertGroupContains( result, "xyz", "zyx" );
		assertGroupContains( result, "x" );
	}

	@Test
	void testLeetCodeExample() {
		String[] input = { "eat", "tea", "ate" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 1, result.size() );
		assertEquals( 3, result.getFirst().size() );
		assertGroupContains( result, "eat", "tea", "ate" );
	}

	@Test
	void testLeetCodeExampleTwo() {
		String[] input = { "" };
		List<List<String>> result = solution.groupAnagrams( input );

		assertEquals( 1, result.size() );
		assertEquals( 1, result.getFirst().size() );
		assertTrue( result.getFirst().contains( "" ) );
	}
}
