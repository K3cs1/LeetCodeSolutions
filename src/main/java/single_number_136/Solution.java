package single_number_136;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        Arrays.stream(nums).forEach(num -> {
            Integer actualNum = numsMap.get(num);
            if (actualNum != null) {
                numsMap.put(num, ++actualNum);
            } else {
                numsMap.put(num, 1);
            }
        });

        for (int key : numsMap.keySet()) {
            if (numsMap.get(key) == 1) {
                return key;
            }
        }
        return 1;
    }

}
