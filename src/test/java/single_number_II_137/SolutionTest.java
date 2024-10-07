package single_number_II_137;

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
    void singleNumber() {
    }

    @Test
    void singleNumber_1() {
        assertEquals(3, solution.singleNumber(new int[]{2,2,3,2}));
    }

    @Test
    void singleNumber_2() {
        assertEquals(99, solution.singleNumber(new int[]{0,1,0,1,0,1,99}));
    }
}