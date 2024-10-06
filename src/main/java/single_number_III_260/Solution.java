package single_number_III_260;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static int[] singleNumber(int[] nums) {
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
        ).mapToInt(num -> num).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{1,2,1,3,2,5})));
        System.out.println(Arrays.toString(singleNumber(new int[]{-1,0})));
        System.out.println(Arrays.toString(singleNumber(new int[]{0,1})));
    }
}
