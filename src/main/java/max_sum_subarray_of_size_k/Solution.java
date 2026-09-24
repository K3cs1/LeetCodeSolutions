package max_sum_subarray_of_size_k;

public class Solution {

	public int maxSubarraySum( int[] arr, int k ) {
		// Code here

		int size = arr.length;
		int sumA = 0;
		int maxSum = 0;
		int left = 0;

		for ( int right = 0; right < size; right++ ) {
			sumA += arr[ right ];
			maxSum = Math.max( maxSum, sumA );
			if ( right - left + 1 >= k ) {
				sumA = sumA - arr[ left ];
				left++;
			}
		}
		return maxSum;
	}

}
