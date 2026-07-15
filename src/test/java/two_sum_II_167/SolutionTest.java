package two_sum_II_167;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

	private final Solution solution = new Solution();

	@Test
	void testBasicCase() {
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		int[] expected = {1, 2};
		assertArrayEquals(expected, solution.twoSum(numbers, target));
	}

	@Test
	void testConsecutiveIndices() {
		int[] numbers = {2, 3, 4};
		int target = 6;
		int[] expected = {2, 3};
		assertArrayEquals(expected, solution.twoSum(numbers, target));
	}

	@Test
	void testNegativeNumbers() {
		int[] numbers = {-1, 0};
		int target = -1;
		int[] expected = {1, 2};
		assertArrayEquals(expected, solution.twoSum(numbers, target));
	}

	@Test
	void testTwoElements() {
		int[] numbers = {1, 2};
		int target = 3;
		int[] expected = {1, 2};
		assertArrayEquals(expected, solution.twoSum(numbers, target));
	}

	@Test
	void testLargeArray() {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int target = 15;
		int[] expected = {5, 10};
		assertArrayEquals(expected, solution.twoSum(numbers, target));
	}

	@Test
	void testDuplicateElements() {
		int[] numbers = {1, 2, 3, 4, 4, 9, 9, 9};
		int target = 8;
		int[] expected = {4, 8};
		assertArrayEquals(expected, solution.twoSum(numbers, target));
	}

	@Test
	void testFirstAndLastElements() {
		int[] numbers = {1, 2, 3, 4, 5};
		int target = 6;
		int[] expected = {1, 5};
		assertArrayEquals(expected, solution.twoSum(numbers, target));
	}

	@Test
	void testMixedNegativeAndPositive() {
		int[] numbers = {-10, -8, -2, 1, 2, 2, 3, 5, 8};
		int target = 0;
		int[] expected = {1, 9};
		assertArrayEquals(expected, solution.twoSum(numbers, target));
	}

}
