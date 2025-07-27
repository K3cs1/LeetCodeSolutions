package palindrome_linked_list_234;

import java.util.Stack;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode currNode = head;
        Stack<Integer> stack = new Stack<>();
        while (currNode != null) {
            stack.push(currNode.val);
            currNode = currNode.next;
        }
        while (head != null) {
            int val = stack.pop();
            if (head.val != val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
