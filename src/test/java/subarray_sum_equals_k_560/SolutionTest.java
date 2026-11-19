package subarray_sum_equals_k_560;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	private final Solution solution = new Solution();

	@Test
	void testExampleOne() {
		assertEquals( 2, solution.subarraySum( new int[]{ 1, 1, 1 }, 2 ) );
	}

	@Test
	void testExampleTwo() {
		assertEquals( 2, solution.subarraySum( new int[]{ 1, 2, 3 }, 3 ) );
	}

	@Test
	void testEmptyArray() {
		assertEquals( 0, solution.subarraySum( new int[]{}, 0 ) );
	}

	@Test
	void testSingleElementMatch() {
		assertEquals( 1, solution.subarraySum( new int[]{ 5 }, 5 ) );
	}

	@Test
	void testSingleElementNoMatch() {
		assertEquals( 0, solution.subarraySum( new int[]{ 5 }, 3 ) );
	}

	@Test
	void testNoMatch() {
		assertEquals( 0, solution.subarraySum( new int[]{ 1, 2, 3 }, 10 ) );
	}

	@Test
	void testWholeArrayIsAnswer() {
		assertEquals( 1, solution.subarraySum( new int[]{ 1, 2, 3 }, 6 ) );
	}

	@Test
	void testNegativeNumbers() {
		// subarrays summing to 0: [1,-1], [1,-1,0], [0]
		assertEquals( 3, solution.subarraySum( new int[]{ 1, -1, 0 }, 0 ) );
	}

	@Test
	void testNegativeK() {
		// subarrays summing to -1: [-1] at index 0, [-1] at index 1, [-1,-1,1]
		assertEquals( 3, solution.subarraySum( new int[]{ -1, -1, 1 }, -1 ) );
	}

	@Test
	void testAllZerosKZero() {
		// every non-empty subarray sums to 0: 3 * 4 / 2 = 6
		assertEquals( 6, solution.subarraySum( new int[]{ 0, 0, 0 }, 0 ) );
	}

	@Test
	void testOverlappingSubarrays() {
		// subarrays summing to 3: [1,2], [3], [3,0]
		assertEquals( 3, solution.subarraySum( new int[]{ 1, 2, 3, 0 }, 3 ) );
	}

	@Test
	void testMatchAtEnd() {
		assertEquals( 1, solution.subarraySum( new int[]{ 4, 5, 6 }, 6 ) );
	}
}
