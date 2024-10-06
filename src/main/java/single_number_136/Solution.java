package single_number_136;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int singleNUmber(int[] nums) {
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

    public static void main(String[] args) {
        System.out.println(singleNUmber(new int[]{2,2,1}));
        System.out.println(singleNUmber(new int[]{4,1,2,1,2}));
        System.out.println(singleNUmber(new int[]{1}));
    }
}
