package search_insert_position_35;

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
    void test1() {
        assertEquals(2, solution.searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    void test2() {
        assertEquals(1, solution.searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    void test3() {
        assertEquals(4, solution.searchInsert(new int[]{1,3,5,6}, 7));
    }

}