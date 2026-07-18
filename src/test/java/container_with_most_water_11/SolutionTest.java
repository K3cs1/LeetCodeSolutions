package container_with_most_water_11;

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
	void maxArea_whenGivenExampleInput_returnsLargestArea() {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		assertEquals( 49, solution.maxArea( height ) );
	}

	@Test
	void maxArea_whenTwoLines_returnsAreaBetweenThem() {
		int[] height = { 1, 1 };

		assertEquals( 1, solution.maxArea( height ) );
	}

	@Test
	void maxArea_whenHeightsIncrease_returnsWidestViableArea() {
		int[] height = { 1, 2, 3, 4, 5 };

		assertEquals( 6, solution.maxArea( height ) );
	}

	@Test
	void maxArea_whenHeightsDecrease_returnsWidestViableArea() {
		int[] height = { 5, 4, 3, 2, 1 };

		assertEquals( 6, solution.maxArea( height ) );
	}

	@Test
	void maxArea_whenTallestLinesAreAtEnds_returnsFullWidthArea() {
		int[] height = { 8, 1, 1, 1, 8 };

		assertEquals( 32, solution.maxArea( height ) );
	}

	@Test
	void maxArea_whenAllHeightsEqual_returnsFullWidthArea() {
		int[] height = { 6, 6, 6, 6 };

		assertEquals( 18, solution.maxArea( height ) );
	}

	@Test
	void maxArea_whenAllHeightsAreZero_returnsZero() {
		int[] height = { 0, 0, 0 };

		assertEquals( 0, solution.maxArea( height ) );
	}

	@Test
	void maxArea_whenFewerThanTwoLines_returnsZero() {
		assertEquals( 0, solution.maxArea( new int[]{ 5 } ) );
	}

}
