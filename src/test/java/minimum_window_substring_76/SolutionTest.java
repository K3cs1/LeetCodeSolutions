package minimum_window_substring_76;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void minWindow_1() {
		Solution solution = new Solution();
		String s = "ADOBECODEBANC";
		String t = "ABC";
		assertEquals( "BANC", solution.minWindow( s, t ) );
	}

	@Test
	void minWindow_2() {
		Solution solution = new Solution();
		String s = "a";
		String t = "a";
		assertEquals( "a", solution.minWindow( s, t ) );
	}

	@Test
	void minWindow_3() {
		Solution solution = new Solution();
		String s = "a";
		String t = "aa";
		assertEquals( "", solution.minWindow( s, t ) );
	}
}
