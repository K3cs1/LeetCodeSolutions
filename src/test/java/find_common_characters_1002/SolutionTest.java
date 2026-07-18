package find_common_characters_1002;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	private Solution finder;

	@BeforeEach
	void setUp() {
		finder = new Solution();
	}

	@Test
	void commonChars_whenLettersRepeatAcrossWords_returnsEachSharedOccurrence() {
		assertEquals( List.of( "e", "l", "l" ),
			finder.commonChars( new String[]{ "bella", "label", "roller" } ) );
	}

	@Test
	void commonChars_whenWordsShareTwoLetters_returnsBothLetters() {
		assertEquals( List.of( "c", "o" ),
			finder.commonChars( new String[]{ "cool", "lock", "cook" } ) );
	}

	@Test
	void commonChars_whenSharedLetterCountDiffers_returnsMinimumOccurrences() {
		assertEquals( List.of( "a", "a" ),
			finder.commonChars( new String[]{ "aaa", "aaa", "aa" } ) );
	}
}
