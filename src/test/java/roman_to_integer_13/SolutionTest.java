package roman_to_integer_13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;


    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void romanToInt_III() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void romanToInt_IV() {
        assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    void romanToInt_IX() {
        assertEquals(9, solution.romanToInt("IX"));
    }

    @Test
    void romanToInt_LVIII() {
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void romanToInt_MCMXCIV() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}