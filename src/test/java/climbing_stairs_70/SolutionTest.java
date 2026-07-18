package climbing_stairs_70;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private final Solution solution = new Solution();

	@Test
	void testClimbStairs1() {
		assertEquals(1, solution.climbStairs(1));
	}

	@Test
	void testClimbStairs2() {
		assertEquals(2, solution.climbStairs(2));
	}

	@Test
	void testClimbStairs3() {
		assertEquals(3, solution.climbStairs(3));
	}

	@Test
	void testClimbStairs4() {
		assertEquals(5, solution.climbStairs(4));
	}

	@Test
	void testClimbStairs5() {
		assertEquals(8, solution.climbStairs(5));
	}
}