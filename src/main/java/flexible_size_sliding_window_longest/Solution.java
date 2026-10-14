package flexible_size_sliding_window_longest;

import java.util.List;

public class Solution {

	static void main() {
		List<Integer> nums = List.of( 1, 6, 3, 1, 2, 4, 5 );
		int target = 10;
		System.out.println( Solution.subarraySumLongest( nums, target ) );

		nums = List.of( 1, 6, 3, 1, 2, 4, 5, 7, 8, 3, 2 );
		target = 15;
		System.out.println( Solution.subarraySumLongest( nums, target ) );
	}

	public static int subarraySumLongest( List<Integer> nums, int target ) {
		// WRITE YOUR BRILLIANT CODE HERE
		int windowSum = 0;
		int length = 0;
		int left = 0;
		for ( int right = 0; right < nums.size(); ++right ) {
			windowSum += nums.get( right );
			while ( windowSum > target ) {
				windowSum -= nums.get( left );
				++left;
			}
			length = Math.max( length, right - left + 1 );
		}
		return length;
	}

}
