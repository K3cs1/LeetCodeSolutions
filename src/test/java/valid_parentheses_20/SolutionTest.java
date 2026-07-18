package valid_parentheses_20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	// Instance of the class to be tested
	Solution solution = new Solution();

	@Test
	void testValidParentheses() {
		assertTrue(solution.isValid("()"));
		assertTrue(solution.isValid("()[]{}"));
		assertTrue(solution.isValid("{[]}"));
	}

	@Test
	void testInvalidParentheses() {
		assertFalse(solution.isValid("(]"));
		assertFalse(solution.isValid("([)]"));
		assertFalse(solution.isValid("{[(])}"));
	}

	@Test
	void testEmptyString() {
		assertTrue(solution.isValid(""));
	}

	@Test
	void testSingleParenthesis() {
		assertFalse(solution.isValid("("));
		assertFalse(solution.isValid(")"));
	}

	@Test
	void testValid() {
		assertTrue(solution.isValid("({}[])"));
		assertTrue(solution.isValid("({(){}()})()({(){}()})(){()}"));
		assertTrue(solution.isValid("[]{}(){()}((())){{}}{()()}{{}{}}"));
		assertTrue(solution.isValid("[[]][][]"));
	}

	@Test
	void testInvalid() {
		assertFalse(solution.isValid("(({})})"));
		assertFalse(solution.isValid("{}()))(()()({}}{}"));
		assertFalse(solution.isValid("}}}}"));
		assertFalse(solution.isValid("))))"));
		assertFalse(solution.isValid("{{{"));
		assertFalse(solution.isValid("((("));
		assertFalse(solution.isValid("}{"));
	}
}
