package remove_duplicates_from_sorted_array_26;

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
    void removeDuplicatesTest1() {
        int[] nums = new int[]{1, 1, 2};
        assertEquals(2, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 0}, nums);
    }

    @Test
    void removeDuplicatesTest2() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 0, 0, 0, 0, 0}, nums);
    }

    @Test
    void removeDuplicatesTest3() {
        int[] nums = new int[]{};
        assertEquals(0, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{}, nums);
    }

    @Test
    void removeDuplicatesTest4() {
        int[] nums = new int[]{1};
        assertEquals(1, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    void removeDuplicatesTest5() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        assertEquals(5, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums);
    }

    @Test
    void removeDuplicatesTest6() {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        assertEquals(1, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, nums);
    }

    @Test
    void removeDuplicatesTest7() {
        int[] nums = new int[]{1, 2, 2, 2, 3, 3, 4};
        assertEquals(4, solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2, 3, 4, 0, 0, 0}, nums);
    }
}