package subarray_sum_equals_k_560;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public int subarraySum( int[] nums, int k ) {
		Map<Integer, Integer> prefixSums = new HashMap<>();
		prefixSums.put( 0, 1 );
		int curSum = 0;
		int count = 0;
		for ( int val : nums ) {
			curSum += val;
			int complement = curSum - k;
			if ( prefixSums.containsKey( complement ) ) {
				count += prefixSums.get( complement );
			}
			if ( prefixSums.containsKey( curSum ) ) {
				prefixSums.replace( curSum, prefixSums.get( curSum ) + 1 );
			} else {
				prefixSums.put( curSum, 1 );
			}
		}
		return count;
	}
}
