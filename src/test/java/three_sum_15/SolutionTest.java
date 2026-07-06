package three_sum_15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	private Solution solution;

	@BeforeEach
	void setUp() {
		this.solution = new Solution();
	}

	@Test
	void threeSumTest1() {
		int[] nums = new int[]{ -1, 0, 1, 2, -1, -4 };
		assertEquals(
				List.of( List.of( -1, -1, 2 ), List.of( -1, 0, 1 ) ),
				solution.threeSum( nums ) );
	}

	@Test
	void threeSumTest2() {
		int[] nums = new int[]{ 0, 1, 1 };
		assertTrue( solution.threeSum( nums ).isEmpty() );
	}

	@Test
	void threeSumTest3() {
		int[] nums = new int[]{ 0, 0, 0 };
		assertEquals(
				List.of( List.of( 0, 0, 0 ) ),
				solution.threeSum( nums ) );
	}

	@Test
	void threeSumTest4() {
		int[] nums = new int[]{ 0, 0, 0, 0 };
		assertEquals(
				List.of( List.of( 0, 0, 0 ) ),
				solution.threeSum( nums ) );
	}

	@Test
	void threeSumTest5() {
		int[] nums = new int[]{ -2, 0, 1, 1, 2 };
		assertEquals(
				List.of( List.of( -2, 0, 2 ), List.of( -2, 1, 1 ) ),
				solution.threeSum( nums ) );
	}

	@Test
	void threeSumTest6() {
		int[] nums = new int[]{ 1, 2, 3 };
		assertTrue( solution.threeSum( nums ).isEmpty() );
	}

	@Test
	void threeSumTest7() {
		int[] nums = new int[]{ -4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6 };
		assertEquals(
				List.of(
						List.of( -4, -2, 6 ),
						List.of( -4, 0, 4 ),
						List.of( -4, 1, 3 ),
						List.of( -4, 2, 2 ),
						List.of( -2, -2, 4 ),
						List.of( -2, 0, 2 ) ),
				solution.threeSum( nums ) );
	}
}
