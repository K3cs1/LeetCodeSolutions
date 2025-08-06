package calculate_expression;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculateExpressionTest {

    @Test
    void testCalculateSimpleAddition() {
        CalculateExpression calc = new CalculateExpression();
        String expression = "1+1+2";
        int result = calc.calculate(expression);
        assertEquals(4, result);
    }

    @Test
    void testCalculateMultiDigitAddition() {
        CalculateExpression calc = new CalculateExpression();
        String expression = "12+11+22";
        int result = calc.calculate(expression);
        assertEquals(45, result);
    }

    @Test
    void testCalculateMixedOperations() {
        CalculateExpression calc = new CalculateExpression();
        String expression = "5*1+2";
        int result = calc.calculate(expression);
        assertEquals(7, result);
    }

    @Test
    void testCalculateComplexMixedOperations() {
        CalculateExpression calc = new CalculateExpression();
        String expression = "5*8+2";
        int result = calc.calculate(expression);
        assertEquals(42, result);
    }
}
