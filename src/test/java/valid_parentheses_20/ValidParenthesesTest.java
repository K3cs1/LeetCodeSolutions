package valid_parentheses_20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    // Instance of the class to be tested
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void testValidParentheses() {
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("()[]{}"));
        assertTrue(validParentheses.isValid("{[]}"));
    }

    @Test
    void testInvalidParentheses() {
        assertFalse(validParentheses.isValid("(]"));
        assertFalse(validParentheses.isValid("([)]"));
        assertFalse(validParentheses.isValid("{[(])}"));
    }

    @Test
    void testEmptyString() {
        assertTrue(validParentheses.isValid(""));
    }

    @Test
    void testSingleParenthesis() {
        assertFalse(validParentheses.isValid("("));
        assertFalse(validParentheses.isValid(")"));
    }


    @Test
    void testValid() {
        assertTrue(validParentheses.isValid("({}[])"));
        assertTrue(validParentheses.isValid("({(){}()})()({(){}()})(){()}"));
        assertTrue(validParentheses.isValid("[]{}(){()}((())){{}}}{()()}{{}{}}"));
        assertTrue(validParentheses.isValid("[[]][][]"));
    }

    @Test
    void testInvalid() {
        assertFalse(validParentheses.isValid("(({})})"));
        assertFalse(validParentheses.isValid("{}()))(()()({}}{}"));
        assertFalse(validParentheses.isValid("}}}}"));
        assertFalse(validParentheses.isValid("))))"));
        assertFalse(validParentheses.isValid("{{{"));
        assertFalse(validParentheses.isValid("((("));
        assertFalse(validParentheses.isValid("}{"));
    }
}
