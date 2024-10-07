package single_number_II_137;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        Arrays.stream(nums).forEach(num -> {
            Integer repeated = numMap.get(num);
            if (repeated == null) {
                numMap.put(num, 1);
            } else {
                numMap.put(num, ++repeated);
            }
        });
        return numMap.keySet().stream().filter(num ->
            numMap.get(num) == 1
        ).findFirst().get();
    }

}
