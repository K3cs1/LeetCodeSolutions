package container_with_most_water_11;

public class Solution {
	public int maxArea( int[] height ) {
		int res = 0;
		int left = 0;
		int right = height.length - 1;
		while ( left < right ) {
			int area = (right - left) * Math.min( height[ left ], height[ right ] );
			res = Math.max( res, area );
			if ( height[ left ] < height[ right ] ) {
				left += 1;
			} else if ( height[ left ] > height[ right ] ) {
				right -= 1;
			} else {
				right -= 1;
			}
		}
		return res;
	}
}
