package length_of_last_word_58;

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
    void test0() {
        assertEquals(0, solution.lengthOfLastWord(""));
    }

    @Test
    void test1() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    void test2() {
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void test3() {
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }

}