package remove_element_27;

import java.util.Arrays;

/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class Solution {

	public int removeElement(int[] nums, int val) {
		int[] filteredArr = Arrays.stream( nums )
				.filter( num -> num != val )
				.sorted()
				.toArray();
		final int length = filteredArr.length;
		for ( int i = 0; i < nums.length; i++ ) {
			if (length != 0 && length > i) {
				nums[i] = filteredArr[i];
			} else {
				nums[i]	= 0;
			}
		}
		return length;
	}
}
