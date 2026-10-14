package find_all_anagrams_in_a_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static List<Integer> findAllAnagrams( String original, String check ) {
		// WRITE YOUR BRILLIANT CODE HERE
		int originalLength = original.length();
		int checkLength = check.length();
		if ( originalLength < checkLength ) {
			return Collections.emptyList();
		}
		List<Integer> result = new ArrayList<>();
		// Stores the frequency of each character in the check string
		int[] checkCounter = new int[ 26 ];
		// Stores the frequency of each character in the current window
		int[] window = new int[ 26 ];
		// first window
		for ( int i = 0; i < checkLength; i++ ) {
			checkCounter[ check.charAt( i ) - 'a' ]++;
			window[ original.charAt( i ) - 'a' ]++;
		}
		if ( Arrays.equals( checkCounter, window ) ) {
			result.add( 0 );
		}
		for ( int i = checkLength; i < originalLength; i++ ) {
			window[ original.charAt( i - checkLength ) - 'a' ]--;
			window[ original.charAt( i ) - 'a' ]++;
			if ( Arrays.equals( window, checkCounter ) ) {
				result.add( i - checkLength + 1 );
			}
		}
		return result;
	}
}
