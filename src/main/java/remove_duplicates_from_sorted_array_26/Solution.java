package remove_duplicates_from_sorted_array_26;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
The remaining elements of nums are not important as well as the size of nums.

Return k.
*/
public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1 || nums.length > 3 * Math.pow(10, 4)) {
            return 0;
        }
        for (int num : nums) {
            if (num < -100 || num > 100) {
                return 0;
            }
        }
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> uniqueList = numSet.stream().sorted().toList();
        for (int i = 0; i < uniqueList.size(); i++) {
            nums[i] = uniqueList.get(i);
        }
        Arrays.fill(nums, numSet.size(), nums.length, 0);
        return numSet.size();
    }

}
