package search_a_2d_matrix_74;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	@Test
	void testTargetExists() {
		Solution solution = new Solution();
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
		assertTrue(solution.searchMatrix(matrix, 3));
	}

	@Test
	void testTargetDoesNotExist() {
		Solution solution = new Solution();
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
		assertFalse(solution.searchMatrix(matrix, 13));
	}

	@Test
	void testTargetInMiddleOfRow() {
		Solution solution = new Solution();
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
		assertTrue(solution.searchMatrix(matrix, 16));
	}

	@Test
	void testTargetIsFirstElement() {
		Solution solution = new Solution();
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
		assertTrue(solution.searchMatrix(matrix, 1));
	}

	@Test
	void testTargetIsLastElement() {
		Solution solution = new Solution();
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
		assertTrue(solution.searchMatrix(matrix, 60));
	}

	@Test
	void testTargetSmallerThanAll() {
		Solution solution = new Solution();
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
		assertFalse(solution.searchMatrix(matrix, 0));
	}

	@Test
	void testTargetLargerThanAll() {
		Solution solution = new Solution();
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
		assertFalse(solution.searchMatrix(matrix, 61));
	}

	@Test
	void testTargetBetweenRows() {
		Solution solution = new Solution();
		int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
		assertFalse(solution.searchMatrix(matrix, 8)); // Between 7 and 10
	}

	@Test
	void testWideMatrix() {
		Solution solution = new Solution();
		int[][] matrix = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}};
		assertTrue(solution.searchMatrix(matrix, 6)); // Last column of first row
		assertTrue(solution.searchMatrix(matrix, 12));
	}

	@Test
	void testTallMatrix() {
		Solution solution = new Solution();
		int[][] matrix = {{1}, {3}, {5}, {7}, {9}};
		assertTrue(solution.searchMatrix(matrix, 7));
		assertFalse(solution.searchMatrix(matrix, 4));
	}

	@Test
	void testSingleElementMatrix() {
		Solution solution = new Solution();
		int[][] matrix = {{5}};
		assertTrue(solution.searchMatrix(matrix, 5));
		assertFalse(solution.searchMatrix(matrix, 3));
	}
}
