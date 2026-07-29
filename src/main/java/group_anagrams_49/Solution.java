package group_anagrams_49;

import java.util.*;

public class Solution {
	public List<List<String>> groupAnagrams( String[] strs ) {
		Map<String, List<String>> result = new HashMap<>();
		for ( String str : strs ) {
			char[] charArray = str.toCharArray();
			Arrays.sort( charArray );
			String key = Arrays.toString( charArray );
			if ( result.containsKey( key ) ) {
				result.computeIfPresent( key, ( k, v ) -> {
					v.add( str );
					return v;
				} );
			} else {
				result.computeIfAbsent( key, k -> {
					List<String> values = new ArrayList<>();
					values.add( str );
					return values;
				} );
			}
		}
		return result.values().stream().toList();
	}
}
