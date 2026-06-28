package middle_of_the_linked_list_876;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MiddleOfTheLinkedList {

	Solution solution;
	ListNode head;

	@BeforeEach
	void setup() {
		solution = new Solution();
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
	}

	@Test
	void middleNode1() {
		ListNode listNode = solution.middleNode(head);
		assertEquals(3, listNode.val);
	}

}
