package max_sum_subarray_of_size_k;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	@Test
	void testTypicalCase() {
		Solution solution = new Solution();
		int[] arr = {100, 200, 300, 400};
		assertEquals(700, solution.maxSubarraySum(arr, 2)); // 300 + 400
	}

	@Test
	void testMaxWindowInMiddle() {
		Solution solution = new Solution();
		int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		assertEquals(39, solution.maxSubarraySum(arr, 4)); // 4 + 2 + 10 + 23
	}

	@Test
	void testKEqualsOne() {
		Solution solution = new Solution();
		int[] arr = {3, 9, 1, 7};
		assertEquals(9, solution.maxSubarraySum(arr, 1));
	}

	@Test
	void testKEqualsArrayLength() {
		Solution solution = new Solution();
		int[] arr = {2, 5, 1, 8};
		assertEquals(16, solution.maxSubarraySum(arr, 4)); // Whole array
	}

	@Test
	void testAllNegativeNumbers() {
		Solution solution = new Solution();
		int[] arr = {-5, -2, -8, -1};
		assertEquals(-7, solution.maxSubarraySum(arr, 2)); // -5 + -2
	}

	@Test
	void testShorterPrefixIsNotCounted() {
		Solution solution = new Solution();
		int[] arr = {10, -20, 1, 1};
		assertEquals(2, solution.maxSubarraySum(arr, 2)); // 10 alone is not a window of size 2
	}

	@Test
	void testSingleElementArray() {
		Solution solution = new Solution();
		int[] arr = {-4};
		assertEquals(-4, solution.maxSubarraySum(arr, 1));
	}
}
