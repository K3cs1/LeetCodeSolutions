package two_sum_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    // Instance of the class to be tested
    TwoSum twoSumSolver = new TwoSum();

    @Test
    void testTwoSumFound() {
        assertArrayEquals(new int[]{0, 1}, twoSumSolver.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, twoSumSolver.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, twoSumSolver.twoSum(new int[]{1, 5, 3, 7}, 6));
    }

    @Test
    void testTwoSumNoSolution() {
        assertArrayEquals(new int[]{}, twoSumSolver.twoSum(new int[]{2, 5, 6}, 10));
        assertArrayEquals(new int[]{}, twoSumSolver.twoSum(new int[]{}, 5)); // Edge case: empty array
    }

    @Test
    void testTwoSumSingleElement() {
        assertArrayEquals(new int[]{}, twoSumSolver.twoSum(new int[]{5}, 5));
    }

    @Test
    void testTwoSumMultiplePairs() {
        // Assuming the first correct pair it finds is returned
        int[] result = twoSumSolver.twoSum(new int[]{1, 2, 3, 4, 4}, 8);
        boolean validPair = (result[0] == 3 && result[1] == 4) || (result[0] == 2 && result[1] == 4);
        assertTrue(validPair);
    }
}
