package longest_substring_without_repeating_characters_3;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int lengthOfLongestSubstring( String s ) {
		// Characters currently inside the window s[left..right]
		Set<Character> charSet = new HashSet<>();
		int left = 0;
		int result = 0;
		// Expand the window by moving right one character at a time
		for ( int right = 0; right < s.length(); right++ ) {
			// Shrink the window from the left until s[right] is no longer a duplicate
			while ( charSet.contains( s.charAt( right ) ) ) {
				// Drop the leftmost character from the window and advance left
				charSet.remove( s.charAt( left ) );
				left++;
			}
			// The window is now duplicate-free, so add the new character
			charSet.add( s.charAt( right ) );
			// Keep the largest window size seen so far
			result = Math.max( result, right - left + 1 );
		}
		return result;
	}
}
