package find_the_index_of_the_first_occurrence_in_a_string_28;

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
        assertEquals(2, solution.strStr("hello", "ll"));
    }

    @Test
    void test2() {
        assertEquals(-1, solution.strStr("aaaaa", "bba"));
    }

    @Test
    void test3() {
        assertEquals(0, solution.strStr("", ""));
    }

    @Test
    void test4() {
        assertEquals(4, solution.strStr("mississippi", "issip"));
    }

}