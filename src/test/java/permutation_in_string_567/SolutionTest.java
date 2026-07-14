package permutation_in_string_567;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	private Solution solution;

	@BeforeEach
	void setUp() {
		solution = new Solution();
	}

	@Test
	void checkInclusion_whenPermutationExistsInMiddle_returnsTrue() {
		assertTrue( solution.checkInclusion( "ab", "eidbaooo" ) );
	}

	@Test
	void checkInclusion_whenPermutationDoesNotExist_returnsFalse() {
		assertFalse( solution.checkInclusion( "ab", "eidboaoo" ) );
	}

	@Test
	void checkInclusion_whenStringsAreEqualPermutation_returnsTrue() {
		assertTrue( solution.checkInclusion( "abc", "bca" ) );
	}

	@Test
	void checkInclusion_whenS1IsLongerThanS2_returnsFalse() {
		assertFalse( solution.checkInclusion( "abcd", "abc" ) );
	}

	@Test
	void checkInclusion_whenDuplicateCharactersMatch_returnsTrue() {
		assertTrue( solution.checkInclusion( "aabc", "eidcaaboo" ) );
	}

	@Test
	void checkInclusion_whenCharacterCountsDoNotMatch_returnsFalse() {
		assertFalse( solution.checkInclusion( "aabc", "caebab" ) );
	}

}
