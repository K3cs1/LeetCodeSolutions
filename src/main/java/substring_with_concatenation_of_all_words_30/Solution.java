package substring_with_concatenation_of_all_words_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public List<Integer> findSubstring( String s, String[] words ) {
		List<Integer> result = new ArrayList<>();
		if ( s == null || words == null || words.length == 0 ) {
			return result;
		}

		int wordLen = words[ 0 ].length();
		int wordCount = words.length;
		int n = s.length();
		if ( wordLen == 0 || n < wordLen * wordCount ) {
			return result;
		}

		Map<String, Integer> need = new HashMap<>();
		for ( String word : words ) {
			need.merge( word, 1, Integer::sum );
		}

		// Each offset forms its own chain of word-aligned windows,
		// so every start index is covered exactly once.
		for ( int offset = 0; offset < wordLen; offset++ ) {
			Map<String, Integer> window = new HashMap<>();
			int left = offset;
			int count = 0;

			for ( int right = offset; right + wordLen <= n; right += wordLen ) {
				String word = s.substring( right, right + wordLen );

				if ( !need.containsKey( word ) ) {
					// Chunk can't be part of any match: reset the window past it
					window.clear();
					count = 0;
					left = right + wordLen;
					continue;
				}

				window.merge( word, 1, Integer::sum );
				count++;

				// Too many of this word: shrink from the left until it fits
				while ( window.get( word ) > need.get( word ) ) {
					String leftWord = s.substring( left, left + wordLen );
					window.merge( leftWord, -1, Integer::sum );
					count--;
					left += wordLen;
				}

				if ( count == wordCount ) {
					result.add( left );
					// Slide by one word
					String leftWord = s.substring( left, left + wordLen );
					window.merge( leftWord, -1, Integer::sum );
					count--;
					left += wordLen;
				}
			}
		}
		return result;
	}
}
