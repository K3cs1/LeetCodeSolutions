package single_number_III_260;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        this.solution = new Solution();
    }

    @Test
    void test() {
        int[] nums = {1, 2, 1, 3, 2, 5};
        assertArrayEquals(new int[]{3, 5}, solution.singleNumber(nums));
    }

    @Test
    void test2() {
        int[] nums = {-1, 0};
        assertArrayEquals(new int[]{-1, 0}, solution.singleNumber(nums));
    }

    @Test
    void test3() {
        int[] nums = {0, 1};
        assertArrayEquals(new int[]{0, 1}, solution.singleNumber(nums));
    }
}