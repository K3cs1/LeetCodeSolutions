package longest_harmonious_subsequence_594;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	private final Solution solution = new Solution();

	@Test
	void testMixedValues() {
		assertEquals( 5, solution.findLHS( new int[]{ 1, 3, 2, 2, 5, 2, 3, 7 } ) );
	}

	@Test
	void testConsecutiveValues() {
		assertEquals( 2, solution.findLHS( new int[]{ 1, 2, 3, 4 } ) );
	}

	@Test
	void testAllEqual() {
		assertEquals( 0, solution.findLHS( new int[]{ 1, 1, 1, 1 } ) );
	}

	@Test
	void testSingleElement() {
		assertEquals( 0, solution.findLHS( new int[]{ 5 } ) );
	}

	@Test
	void testEmptyArray() {
		assertEquals( 0, solution.findLHS( new int[]{} ) );
	}

	@Test
	void testNoPairDifferingByOne() {
		assertEquals( 0, solution.findLHS( new int[]{ 1, 3, 5, 7 } ) );
	}

	@Test
	void testNegativeNumbers() {
		assertEquals( 3, solution.findLHS( new int[]{ -3, -2, -2, 0 } ) );
	}

	@Test
	void testUnsortedWithDuplicates() {
		assertEquals( 4, solution.findLHS( new int[]{ 2, 1, 2, 1, 5 } ) );
	}

	@Test
	void testTwoElements() {
		assertEquals( 2, solution.findLHS( new int[]{ 1, 2 } ) );
	}
}
