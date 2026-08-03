package top_k_frequent_elements_347;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

	public int[] topKFrequent( int[] nums, int k ) {
		int[] result = new int[ k ];
		Map<Integer, Integer> numsMap = new HashMap<>();
		for ( int num : nums ) {
			numsMap.put( num, numsMap.getOrDefault( num, 0 ) + 1 );
		}
		if ( k > numsMap.size() ) {
			return new int[]{};
		}

		int maxValue = 0;
		for ( Map.Entry<Integer, Integer> entry : numsMap.entrySet() ) {
			maxValue = Math.max( entry.getValue(), maxValue );
		}
		for ( Map.Entry<Integer, Integer> entry : numsMap.entrySet() ) {
			if ( entry.getValue() == maxValue ) {
				result[ 0 ] = entry.getKey();
			}
		}
		int counter = 1;
		while ( counter < k ) {
			Iterator<Integer> iterator = numsMap.keySet().iterator();
			while ( iterator.hasNext() ) {
				if ( iterator.next() == result[ counter - 1 ] ) {
					iterator.remove();
				}
			}
			maxValue = 0;
			for ( Map.Entry<Integer, Integer> entry : numsMap.entrySet() ) {
				maxValue = Math.max( entry.getValue(), maxValue );
			}
			for ( Map.Entry<Integer, Integer> entry : numsMap.entrySet() ) {
				if ( entry.getValue() == maxValue ) {
					result[ counter++ ] = entry.getKey();
				}
			}
		}

		return result;
	}

}
