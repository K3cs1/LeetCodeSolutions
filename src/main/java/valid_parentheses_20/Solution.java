package valid_parentheses_20;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {
	public boolean isValid(String s) {
		Map<Character, Character> brackets = new HashMap<>();
		brackets.put(')', '(');
		brackets.put('}', '{');
		brackets.put(']', '[');
		List<Character> stack = new LinkedList<>();
		for (char ch : s.toCharArray()) {
			if (brackets.containsKey(ch)) {
				if (!stack.isEmpty() && stack.getLast() == brackets.get(ch)) {
					stack.removeLast();
				}
				else {
					return false;
				}
			}
			else {
				stack.add(ch);
			}
		}
		return stack.isEmpty();
	}
}
