package merge_two_sorted_lists_21;

import merge_two_sorted_lists_21.Solution.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	@Test
	void testMergeTwoLists_BothNonEmpty() {
		Solution merge = new Solution();
		ListNode l1 = merge.new ListNode(1, merge.new ListNode(2, merge.new ListNode(4)));
		ListNode l2 = merge.new ListNode(1, merge.new ListNode(3, merge.new ListNode(4)));
		ListNode result = merge.mergeTwoLists(l1, l2);

		int[] expected = {1, 1, 2, 3, 4, 4};
		for (int val : expected) {
			assertNotNull(result);
			assertEquals(val, result.val);
			result = result.next;
		}
		assertNull(result);
	}

	@Test
	void testMergeTwoLists_OneEmpty() {
		Solution merge = new Solution();
		ListNode l1 = null;
		ListNode l2 = merge.new ListNode(0, merge.new ListNode(1));
		ListNode result = merge.mergeTwoLists(l1, l2);

		int[] expected = {0, 1};
		for (int val : expected) {
			assertNotNull(result);
			assertEquals(val, result.val);
			result = result.next;
		}
		assertNull(result);
	}

	@Test
	void testMergeTwoLists_BothEmpty() {
		Solution merge = new Solution();
		ListNode result = merge.mergeTwoLists(null, null);
		assertNull(result);
	}

	@Test
	void testMergeTwoLists_DuplicateValues() {
		Solution merge = new Solution();
		ListNode l1 = merge.new ListNode(1, merge.new ListNode(2, merge.new ListNode(2)));
		ListNode l2 = merge.new ListNode(1, merge.new ListNode(3));
		ListNode result = merge.mergeTwoLists(l1, l2);

		int[] expected = {1, 1, 2, 2, 3};
		for (int val : expected) {
			assertNotNull(result);
			assertEquals(val, result.val);
			result = result.next;
		}
		assertNull(result);
	}
}