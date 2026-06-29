package subarray_sum_fixed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarraySumFixedTest {

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

    @Test
    void subarraySum_3() {
        int[] nums = {4, 5, 2, 7, 6, 1, 8, 4};
        Solution solution = new Solution();
        assertEquals(15, solution.subarraySumFixed(nums, 3));
    }

}
