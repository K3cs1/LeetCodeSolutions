package binary_search_704;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	@Test
	void testTypicalCaseTargetExists() {
		Solution solution = new Solution();
		int[] nums = {-1, 0, 3, 5, 9, 12};
		assertEquals(4, solution.search(nums, 9)); // Target 9 is at index 4
	}

	@Test
	void testTargetDoesNotExist() {
		Solution solution = new Solution();
		int[] nums = {-1, 0, 3, 5, 9, 12};
		assertEquals(-1, solution.search(nums, 2)); // Target 2 is not in the array
	}

	@Test
	void testTargetIsFirstElement() {
		Solution solution = new Solution();
		int[] nums = {2, 4, 6, 8, 10};
		assertEquals(0, solution.search(nums, 2)); // Target 2 is at index 0
	}

	@Test
	void testTargetIsLastElement() {
		Solution solution = new Solution();
		int[] nums = {1, 3, 5, 7, 9};
		assertEquals(4, solution.search(nums, 9)); // Target 9 is at index 4
	}

	@Test
	void testEmptyArray() {
		Solution solution = new Solution();
		int[] nums = {};
		assertEquals(-1, solution.search(nums, 10)); // Empty array should return -1
	}

	@Test
	void testArrayWithOneElementTargetMatches() {
		Solution solution = new Solution();
		int[] nums = {5};
		assertEquals(0, solution.search(nums, 5)); // Target 5 is at index 0
	}

	@Test
	void testArrayWithOneElementTargetDoesNotMatch() {
		Solution solution = new Solution();
		int[] nums = {5};
		assertEquals(-1, solution.search(nums, 3)); // Target 3 is not in the array
	}

	@Test
	void testTypicalCaseTargetIsFirst() {
		Solution solution = new Solution();
		int[] nums = {-1, 0, 3, 5, 9, 12};
		assertEquals(0, solution.search(nums, -1)); // Target -1 is at index 0
	}
}
