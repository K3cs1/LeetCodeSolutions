package longest_common_prefix_14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution  = new Solution();
    }

    @Test
    void longestCommonPrefix() {
        String[] strs = {"flower", "flow", "flight"};
        assertEquals("fl", solution.longestCommonPrefix(strs));
    }

    @Test
    void emptyLongestCommonPrefix() {
        Solution solution = new Solution();
        String[] strs = {"dog", "racecar", "car"};
        assertEquals( "", solution.longestCommonPrefix(strs));
    }
}