package calculate_expression;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
    String input parameter: math expression "1+1+2"
    Return evaluated result: 4
*/
public class CalculateExpression {

    public int calculate(String expression) {
        List<Integer> numbers = new LinkedList<>();
        List<Character> operators = new LinkedList<>();
        int currentNumber = 0;
        for (char expChar : expression.toCharArray()) {
            if (Character.isDigit(expChar)) {
                currentNumber = currentNumber * 10 + (expChar - '0');
            } else if (expChar == '+' || expChar == '-' || expChar == '*') {
                numbers.add(currentNumber);
                operators.add(expChar);
                currentNumber = 0;
            }
        }
        numbers.add(currentNumber);

        for (Iterator<Character> it = operators.iterator(); it.hasNext(); ) {
            char operator = it.next();
            if (operator == '*') {
                int index = operators.indexOf(operator);
                int product = numbers.get(index) * numbers.get(index + 1);
                numbers.set(index, product);
                numbers.remove(index + 1);
                it.remove();
            }
        }

        int result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            char operator = operators.get(i);
            int number = numbers.get(i + 1);

            if (operator == '+') {
                result += number;
            } else if (operator == '-') {
                result -= number;
            }
        }

        return result;
    }

}
