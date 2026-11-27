package min_stack_155;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MinStackTest {

	@Test
	void testExampleOne() {
		MinStack stack = new MinStack();
		stack.push( -2 );
		stack.push( 0 );
		stack.push( -3 );
		assertEquals( -3, stack.getMin() );
		stack.pop();
		assertEquals( 0, stack.top() );
		assertEquals( -2, stack.getMin() );
	}

	@Test
	void testSingleElement() {
		MinStack stack = new MinStack();
		stack.push( 5 );
		assertEquals( 5, stack.top() );
		assertEquals( 5, stack.getMin() );
	}

	@Test
	void testIncreasingValuesKeepFirstAsMin() {
		MinStack stack = new MinStack();
		stack.push( 1 );
		stack.push( 2 );
		stack.push( 3 );
		assertEquals( 3, stack.top() );
		assertEquals( 1, stack.getMin() );
	}

	@Test
	void testDecreasingValuesRestoreMinOnPop() {
		MinStack stack = new MinStack();
		stack.push( 3 );
		stack.push( 2 );
		stack.push( 1 );
		assertEquals( 1, stack.getMin() );
		stack.pop();
		assertEquals( 2, stack.getMin() );
		stack.pop();
		assertEquals( 3, stack.getMin() );
	}

	@Test
	void testDuplicateMin() {
		MinStack stack = new MinStack();
		stack.push( 1 );
		stack.push( 1 );
		stack.push( 2 );
		stack.pop();
		assertEquals( 1, stack.getMin() );
		stack.pop();
		assertEquals( 1, stack.top() );
		assertEquals( 1, stack.getMin() );
	}

	@Test
	void testAllEqualValues() {
		MinStack stack = new MinStack();
		stack.push( 7 );
		stack.push( 7 );
		stack.push( 7 );
		stack.pop();
		assertEquals( 7, stack.top() );
		assertEquals( 7, stack.getMin() );
	}

	@Test
	void testIntegerBoundaries() {
		MinStack stack = new MinStack();
		stack.push( Integer.MIN_VALUE );
		stack.push( Integer.MAX_VALUE );
		assertEquals( Integer.MAX_VALUE, stack.top() );
		assertEquals( Integer.MIN_VALUE, stack.getMin() );
		stack.pop();
		assertEquals( Integer.MIN_VALUE, stack.top() );
		assertEquals( Integer.MIN_VALUE, stack.getMin() );
	}

	@Test
	void testReuseAfterEmptyingForgetsOldMin() {
		MinStack stack = new MinStack();
		stack.push( -10 );
		stack.pop();
		stack.push( 4 );
		assertEquals( 4, stack.top() );
		assertEquals( 4, stack.getMin() );
	}

	@Test
	void testTopAndGetMinDoNotRemove() {
		MinStack stack = new MinStack();
		stack.push( 2 );
		assertEquals( 2, stack.top() );
		assertEquals( 2, stack.top() );
		assertEquals( 2, stack.getMin() );
		assertEquals( 2, stack.getMin() );
	}

	@Test
	void testInstancesAreIndependent() {
		MinStack first = new MinStack();
		MinStack second = new MinStack();
		first.push( 1 );
		second.push( 9 );
		assertEquals( 1, first.getMin() );
		assertEquals( 9, second.getMin() );
	}

	@Test
	void testManyElements() {
		MinStack stack = new MinStack();
		for ( int i = 0; i < 10_000; i++ ) {
			stack.push( i );
		}
		assertEquals( 9_999, stack.top() );
		assertEquals( 0, stack.getMin() );
	}

	@Test
	void testPopOnEmptyThrows() {
		MinStack stack = new MinStack();
		assertThrows( NoSuchElementException.class, stack::pop );
	}

	@Test
	void testTopOnEmptyThrows() {
		MinStack stack = new MinStack();
		assertThrows( NoSuchElementException.class, stack::top );
	}

	@Test
	void testGetMinOnEmptyThrows() {
		MinStack stack = new MinStack();
		assertThrows( NoSuchElementException.class, stack::getMin );
	}
}
