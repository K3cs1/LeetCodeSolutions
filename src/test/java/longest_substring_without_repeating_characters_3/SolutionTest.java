package longest_substring_without_repeating_characters_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void lengthOfLongestSubstring1() {
        Solution solution = new Solution();
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void lengthOfLongestSubstring2() {
        Solution solution = new Solution();
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void lengthOfLongestSubstring3() {
        Solution solution = new Solution();
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

}
