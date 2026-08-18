package longest_consecutive_sequence_128;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
	public int longestConsecutive( int[] nums ) {
		Set<Integer> numSet = Arrays.stream( nums ).boxed().collect( Collectors.toSet() );
		int longest = 0;

		for ( int num : nums ) {
			if ( !numSet.contains( num - 1 ) ) {
				int length = 0;
				while ( numSet.contains( num + length ) ) {
					length++;
				}
				longest = Math.max( length, longest );
			}
		}
		return longest;
	}
}
