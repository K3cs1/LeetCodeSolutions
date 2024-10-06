package longest_common_prefix_14;

public class Solution {

    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     *
     * @param strs
     * @return The Longest Common Prefix
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null ||strs.length < 1 || strs.length > 200) {
            return "";
        }
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].isEmpty() || strs[i].length() > 200) {
                return "";
            }
            if (!strs[i].matches("[a-z]+")) {
                return "";
            }
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(strs));

        strs = new String[]{"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(strs));
    }

}
