package subarray_sum_fixed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubarraySumFixed {

	@Test
	void subarraySum_1() {
		int[] nums = {1, 1, 1};
		Solution solution = new Solution();
		assertEquals(2, solution.subarraySumFixed(nums, 2));
	}

	@Test
	void subarraySum_2() {
		int[] nums = {1, 2, 3};
		Solution solution = new Solution();
		assertEquals(6, solution.subarraySumFixed(nums, 3));
	}

}
