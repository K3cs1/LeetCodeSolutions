package min_stack_155;

import java.util.LinkedList;
import java.util.List;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
class MinStack {

	private final List<Integer> stack;
	private final List<Integer> minStack;

	public MinStack() {
		stack = new LinkedList<>();
		minStack = new LinkedList<>();
	}

	public void push( int value ) {
		stack.addLast( value );
		value = Math.min( value, minStack.isEmpty() ? value : minStack.getLast() );
		minStack.addLast( value );
	}

	public void pop() {
		stack.removeLast();
		minStack.removeLast();
	}

	public int top() {
		return stack.getLast();
	}

	public int getMin() {
		return minStack.getLast();
	}
}