package top_k_frequent_elements_347;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

	public int[] topKFrequent( int[] nums, int k ) {
		int[] result = new int[ k ];
		Map<Integer, Integer> countMap = new HashMap<>();
		Map<Integer, Set<Integer>> freqMap = new HashMap<>();
		for ( int num = 0; num < nums.length + 1; num++ ) {
			freqMap.put( num, freqMap.getOrDefault( num, new HashSet<>() ) );
		}
		if ( k > freqMap.size() ) {
			return new int[]{};
		}

		for ( int num : nums ) {
			countMap.put( num, countMap.getOrDefault( num, 0 ) + 1 );
		}

		for ( Map.Entry<Integer, Integer> entry : countMap.entrySet() ) {
			freqMap.get( entry.getValue() ).add( entry.getKey() );
		}

		int countK = 0;
		for ( int i = freqMap.size() - 1; i > 0; i-- ) {
			for ( int num : freqMap.get( i ) ) {
				result[ countK++ ] = num;
				if ( countK == k ) {
					return result;
				}
			}
		}
		return result;
	}

}
