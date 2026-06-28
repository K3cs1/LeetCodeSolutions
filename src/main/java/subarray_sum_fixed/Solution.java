package subarray_sum_fixed;

public class Solution {
	public int subarraySumFixed(int[] nums, int k) {
		int windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += nums[i];
		}
		int largest = windowSum;
		for (int right = k; right < nums.length; right++) {
			int left = right - k;
			windowSum -= nums[left];
			windowSum += nums[right];
			largest = Math.max(largest, windowSum);
		}
		return largest;
	}
}
