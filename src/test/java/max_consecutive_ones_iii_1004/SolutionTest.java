package max_consecutive_ones_iii_1004;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	private Solution solution;

	@BeforeEach
	void setUp() {
		solution = new Solution();
	}

	@Test
	void longestOnes_whenTwoZerosCanBeFlipped_returnsLongestWindow() {
		int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };

		assertEquals( 6, solution.longestOnes( nums, 2 ) );
	}

	@Test
	void longestOnes_whenThreeZerosCanBeFlipped_returnsLongestWindow() {
		int[] nums = { 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0 };

		assertEquals( 10, solution.longestOnes( nums, 3 ) );
	}

	@Test
	void longestOnes_whenNoZerosCanBeFlipped_returnsLongestExistingRun() {
		int[] nums = { 1, 1, 0, 1, 1, 1, 0, 1 };

		assertEquals( 3, solution.longestOnes( nums, 0 ) );
	}

	@Test
	void longestOnes_whenArrayContainsOnlyOnes_returnsArrayLength() {
		int[] nums = { 1, 1, 1, 1 };

		assertEquals( 4, solution.longestOnes( nums, 0 ) );
	}

	@Test
	void longestOnes_whenArrayContainsOnlyZeros_returnsNumberOfAvailableFlips() {
		int[] nums = { 0, 0, 0, 0, 0 };

		assertEquals( 2, solution.longestOnes( nums, 2 ) );
	}

	@Test
	void longestOnes_whenAvailableFlipsCoverEveryZero_returnsArrayLength() {
		int[] nums = { 0, 1, 0, 1, 0 };

		assertEquals( 5, solution.longestOnes( nums, 5 ) );
	}

	@Test
	void longestOnes_whenArrayIsEmpty_returnsZero() {
		assertEquals( 0, solution.longestOnes( new int[ 0 ], 0 ) );
	}

}
