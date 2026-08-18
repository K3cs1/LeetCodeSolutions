package longest_consecutive_sequence_128;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private final Solution solution = new Solution();

	@Test
	void testTypicalCase() {
		int[] nums = {100, 4, 200, 1, 3, 2};
		Assertions.assertEquals(4, solution.longestConsecutive(nums));
	}

	@Test
	void testWithDuplicatesAndUnsortedRuns() {
		int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
		Assertions.assertEquals(9, solution.longestConsecutive(nums));
	}

	@Test
	void testEmptyArray() {
		int[] nums = {};
		Assertions.assertEquals(0, solution.longestConsecutive(nums));
	}

	@Test
	void testSingleElement() {
		int[] nums = {5};
		Assertions.assertEquals(1, solution.longestConsecutive(nums));
	}

	@Test
	void testAllSameElement() {
		int[] nums = {7, 7, 7, 7};
		Assertions.assertEquals(1, solution.longestConsecutive(nums));
	}

	@Test
	void testNoConsecutiveElements() {
		int[] nums = {10, 20, 30, 40};
		Assertions.assertEquals(1, solution.longestConsecutive(nums));
	}

	@Test
	void testNegativeNumbers() {
		int[] nums = {-3, -2, -1, 0, 1};
		Assertions.assertEquals(5, solution.longestConsecutive(nums));
	}
}
