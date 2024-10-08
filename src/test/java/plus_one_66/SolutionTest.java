package plus_one_66;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void test1() {
        int[] digits = {1, 2, 3};
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    void test2() {
        int[] digits = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    void test3() {
        int[] digits = {0};
        int[] expected = {1};
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    void test4() {
        int[] digits = {9};
        int[] expected = {1, 0};
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    void test5() {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] expected = {9,8,7,6,5,4,3,2,1,1};
        assertArrayEquals(expected, solution.plusOne(digits));
    }
}