package two_sum_II_167;

public class Solution {

	public int[] twoSum( int[] numbers, int target ) {
		// O(n*log(n))
		int right = 0;
		int left = numbers.length - 1;
		while ( right < left ) {
			int sum = numbers[ right ] + numbers[ left ];
			if ( sum == target ) {
				return new int[]{ right + 1, left + 1 };
			} else if ( sum < target ) {
				right++;
			} else {
				left--;
			}
		}
		return new int[ 2 ];
	}
	
}
