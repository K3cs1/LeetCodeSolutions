package max_sum_subarray_of_size_k;

public class Solution {

	public int maxSubarraySum( int[] arr, int k ) {
		// Code here

		int size = arr.length;
		int sumA = 0;
		int maxSum = Integer.MIN_VALUE;
		int left = 0;

		for ( int right = 0; right < size; right++ ) {
			sumA += arr[ right ];
			if ( right - left + 1 == k ) {
				maxSum = Math.max( maxSum, sumA );
				sumA = sumA - arr[ left ];
				left++;
			}
		}
		return maxSum;
	}

}
