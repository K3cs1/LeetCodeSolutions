package top_k_frequent_elements_347;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private final Solution solution = new Solution();

	private int[] sorted(int[] arr) {
		int[] copy = arr.clone();
		Arrays.sort(copy);
		return copy;
	}

	@Test
	void testTypicalCase() {
		int[] nums = {1, 1, 1, 2, 2, 3};
		Assertions.assertArrayEquals(new int[] {1, 2}, sorted(solution.topKFrequent(nums, 2)));
	}

	@Test
	void testSingleElement() {
		int[] nums = {1};
		Assertions.assertArrayEquals(new int[] {1}, solution.topKFrequent(nums, 1));
	}

	@Test
	void testKEqualsUniqueCount() {
		int[] nums = {1, 2, 3};
		Assertions.assertArrayEquals(new int[] {1, 2, 3}, sorted(solution.topKFrequent(nums, 3)));
	}

	@Test
	void testAllSameElement() {
		int[] nums = {5, 5, 5, 5};
		Assertions.assertArrayEquals(new int[] {5}, solution.topKFrequent(nums, 1));
	}

	@Test
	void testNegativeNumbers() {
		int[] nums = {-1, -1, -2, -2, -2, 3};
		Assertions.assertArrayEquals(new int[] {-2, -1}, sorted(solution.topKFrequent(nums, 2)));
	}

	@Test
	void testTopOne() {
		int[] nums = {4, 4, 4, 2, 2, 1};
		Assertions.assertArrayEquals(new int[] {4}, solution.topKFrequent(nums, 1));
	}
}
