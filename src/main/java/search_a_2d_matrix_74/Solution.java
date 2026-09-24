package search_a_2d_matrix_74;

class Solution {
	public boolean searchMatrix( int[][] matrix, int target ) {
		final int ROWS = matrix.length;
		final int COLS = matrix[ 0 ].length;
		int top = 0;
		int bottom = ROWS - 1;
		while ( top <= bottom ) {
			int row = (top + bottom) / 2;
			if ( target > matrix[ row ][ COLS - 1 ] ) {
				top = row + 1;
			} else if ( target < matrix[ row ][ 0 ] ) {
				bottom = row - 1;
			} else {
				break;
			}
		}

		if ( !(top <= bottom) ) {
			return false;
		}
		int row = (top + bottom) / 2;
		int left = 0;
		int right = COLS - 1;
		while ( left <= right ) {
			int middle = (left + right) / 2;
			if ( target > matrix[ row ][ middle ] ) {
				left = middle + 1;
			} else if ( target < matrix[ row ][ middle ] ) {
				right = middle - 1;
			} else {
				return true;
			}
		}
		return false;
	}
}
