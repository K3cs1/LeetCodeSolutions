package contains_duplicate_II_219;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

	private final Solution solution = new Solution();

	@Test
	void testDuplicateWithinDistance() {
		assertTrue( solution.containsNearbyDuplicate( new int[]{ 1, 2, 3, 1 }, 3 ) );
	}

	@Test
	void testAdjacentDuplicates() {
		assertTrue( solution.containsNearbyDuplicate( new int[]{ 1, 0, 1, 1 }, 1 ) );
	}

	@Test
	void testDuplicateTooFarApart() {
		assertFalse( solution.containsNearbyDuplicate( new int[]{ 1, 2, 3, 1, 2, 3 }, 2 ) );
	}

	@Test
	void testDistanceExactlyK() {
		assertTrue( solution.containsNearbyDuplicate( new int[]{ 5, 6, 7, 5 }, 3 ) );
	}

	@Test
	void testDistanceOneMoreThanK() {
		assertFalse( solution.containsNearbyDuplicate( new int[]{ 5, 6, 7, 5 }, 2 ) );
	}

	@Test
	void testNoDuplicates() {
		assertFalse( solution.containsNearbyDuplicate( new int[]{ 1, 2, 3, 4 }, 10 ) );
	}

	@Test
	void testKIsZero() {
		assertFalse( solution.containsNearbyDuplicate( new int[]{ 1, 1, 1 }, 0 ) );
	}

	@Test
	void testEmptyArray() {
		assertFalse( solution.containsNearbyDuplicate( new int[]{}, 3 ) );
	}

	@Test
	void testSingleElement() {
		assertFalse( solution.containsNearbyDuplicate( new int[]{ 1 }, 1 ) );
	}

	@Test
	void testUsesMostRecentOccurrence() {
		// first pair (0,3) is too far, but (3,4) is within k
		assertTrue( solution.containsNearbyDuplicate( new int[]{ 9, 1, 2, 9, 9 }, 1 ) );
	}

	@Test
	void testNegativeAndLargeValues() {
		assertTrue( solution.containsNearbyDuplicate( new int[]{ -1, Integer.MAX_VALUE, -1 }, 2 ) );
	}
}
