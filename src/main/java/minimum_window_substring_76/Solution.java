package minimum_window_substring_76;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public String minWindow( String s, String t ) {
		if ( t.isBlank() ) {
			return "";
		}
		Map<Character, Integer> countT = new HashMap<>();
		Map<Character, Integer> window = new HashMap<>();
		for ( int c = 0; c < t.length(); c++ ) {
			char tKey = t.charAt( c );
			countT.put( tKey, countT.getOrDefault( tKey, 0 ) + 1 );
		}
		int have = 0;
		int need = countT.size();
		int[] res = new int[]{ -1, -1 };
		int resLen = Integer.MAX_VALUE;

		int left = 0;
		for ( int right = 0; right < s.length(); right++ ) {
			char sKeyRight = s.charAt( right );
			window.put( sKeyRight, window.getOrDefault( sKeyRight, 0 ) + 1 );

			if ( countT.containsKey( sKeyRight ) &&
					window.get( sKeyRight ).equals( countT.get( sKeyRight ) ) ) {
				have++;
			}
			while ( have == need ) {
				// update our result;
				if ( (right - left + 1) < resLen ) {
					res[ 0 ] = left;
					res[ 1 ] = right;
					resLen = (right - left + 1);
				}
				// pop from the left or our window
				char sKeyLeft = s.charAt( left );
				window.put( sKeyLeft, window.get( sKeyLeft ) - 1 );
				if ( countT.containsKey( sKeyLeft ) &&
						window.get( sKeyLeft ).compareTo( countT.get( sKeyLeft ) ) < 0 ) {
					have--;
				}
				left++;
			}
		}
		int resLeft = res[ 0 ];
		int resRight = res[ 1 ];
		if ( resLen != Integer.MAX_VALUE ) {
			return s.substring( resLeft, resRight + 1 );
		}
		return "";
	}

}
