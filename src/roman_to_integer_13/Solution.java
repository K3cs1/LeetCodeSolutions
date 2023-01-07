package roman_to_integer_13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumMap = new HashMap<>();
        int number = 0;
        romanNumMap.put('I', 1);
        romanNumMap.put('V', 5);
        romanNumMap.put('X', 10);
        romanNumMap.put('L', 50);
        romanNumMap.put('C', 100);
        romanNumMap.put('D', 500);
        romanNumMap.put('M', 1000);
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        for (int i = 0; i < s.length(); i++) {
            number = number + romanNumMap.get(s.charAt(i));
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
