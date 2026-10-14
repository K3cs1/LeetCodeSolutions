package flexible_size_sliding_window_longest;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void testExampleOne() {
		assertEquals( 4, Solution.subarraySumLongest( List.of( 1, 6, 3, 1, 2, 4, 5 ), 10 ) );
	}

	@Test
	void testExampleTwo() {
		assertEquals( 5, Solution.subarraySumLongest( List.of( 1, 6, 3, 1, 2, 4, 5, 7, 8, 3, 2 ), 15 ) );
	}

	@Test
	void testEmptyList() {
		assertEquals( 0, Solution.subarraySumLongest( List.of(), 10 ) );
	}

	@Test
	void testEveryElementExceedsTarget() {
		assertEquals( 0, Solution.subarraySumLongest( List.of( 5, 6, 7 ), 4 ) );
	}

	@Test
	void testWholeArrayFits() {
		assertEquals( 4, Solution.subarraySumLongest( List.of( 1, 2, 3, 4 ), 10 ) );
	}

	@Test
	void testWholeArrayFitsExactly() {
		assertEquals( 3, Solution.subarraySumLongest( List.of( 2, 3, 5 ), 10 ) );
	}

	@Test
	void testSingleElementFits() {
		assertEquals( 1, Solution.subarraySumLongest( List.of( 3 ), 3 ) );
	}

	@Test
	void testSingleElementTooLarge() {
		assertEquals( 0, Solution.subarraySumLongest( List.of( 4 ), 3 ) );
	}

	@Test
	void testZeroTargetWithZeros() {
		assertEquals( 3, Solution.subarraySumLongest( List.of( 0, 0, 0 ), 0 ) );
	}

	@Test
	void testZeroTargetWithMixedValues() {
		assertEquals( 2, Solution.subarraySumLongest( List.of( 1, 0, 0, 2 ), 0 ) );
	}

	@Test
	void testBestWindowAtStart() {
		assertEquals( 3, Solution.subarraySumLongest( List.of( 1, 1, 1, 9, 9 ), 3 ) );
	}

	@Test
	void testBestWindowAtEnd() {
		assertEquals( 3, Solution.subarraySumLongest( List.of( 9, 9, 1, 1, 1 ), 3 ) );
	}

	@Test
	void testWindowShrinksMultipleElements() {
		// adding 10 forces the window to drop 1, 1, 1; the earlier window of 3 stays the best
		assertEquals( 3, Solution.subarraySumLongest( List.of( 1, 1, 1, 10 ), 10 ) );
	}

	@Test
	void testLongerWindowLaterWins() {
		assertEquals( 4, Solution.subarraySumLongest( List.of( 5, 5, 9, 1, 1, 1, 1 ), 4 ) );
	}
}
