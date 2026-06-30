package longest_substring_without_repeating_characters_3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int l = 0;
        Map<Character, Integer> counter = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            counter.put(s.charAt(r), counter.getOrDefault(s.charAt(r), 0) + 1);
            while (counter.get(s.charAt(r)) > 1) {
                counter.put(s.charAt(l), counter.get(s.charAt(l)) - 1);
                l += 1;
            }
            longest = Math.max(longest, r - l + 1);
        }
        return longest;
    }
}
