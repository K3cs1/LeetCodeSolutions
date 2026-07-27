package valid_anagram_242;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isAnagram( String s, String t ) {
		Map<Character, Integer> sMap = new HashMap<>();
		Map<Character, Integer> tMap = new HashMap<>();
		if ( s.length() != t.length() ) {
			return false;
		}
		for ( int i = 0; i < s.length(); i++ ) {
			sMap.put( s.charAt( i ), sMap.getOrDefault( s.charAt( i ), 0 ) + 1 );
			tMap.put( t.charAt( i ), tMap.getOrDefault( t.charAt( i ), 0 ) + 1 );
		}
		for ( Map.Entry<Character, Integer> entry : sMap.entrySet() ) {
			if ( !entry.getValue().equals( tMap.get( entry.getKey() ) ) ) {
				return false;
			}
		}
		return true;
	}
}
