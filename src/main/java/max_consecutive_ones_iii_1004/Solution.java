package max_consecutive_ones_iii_1004;

public class Solution {

	public int longestOnes( int[] nums, int k ) {
		int maxWindow = 0;
		int numberOfZeros = 0;
		int numLength = nums.length;
		int left = 0;

		for ( int right = 0; right < numLength; right++ ) {
			if ( nums[ right ] == 0 ) {
				numberOfZeros++;
			}
			while ( numberOfZeros > k ) {
				if ( nums[ left ] == 0 ) {
					numberOfZeros--;
				}
				left++;
			}
			int window = right - left + 1;
			maxWindow = Math.max( maxWindow, window );

		}
		return maxWindow;
	}

}
