package remove_element_27;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution solution;

	@BeforeEach
	void setUp() {
		solution =  new Solution();
	}

	@Test
	void test_1() {
		int[] nums = { 3, 2, 2, 3 };
		int actual = solution.removeElement( nums, 3 );
		assertEquals(2, actual );
		assertArrayEquals( new int[]{2,2,0,0}, nums);
	}

	@Test
	void test_2() {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int actual = solution.removeElement( nums, 2 );
		assertEquals(5, actual );
		assertArrayEquals( new int[]{0,0,1,3,4,0,0,0}, nums);
	}

	@Test
	void test_3() {
		int[] nums = { 2 };
		int actual = solution.removeElement( nums, 3 );
		assertEquals(1, actual );
		assertArrayEquals( new int[]{2}, nums);
	}
}