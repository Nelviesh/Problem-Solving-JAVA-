/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify result list creation
        ListNode current = dummy;  // Pointer to build the new list
        int carry = 0; // Initialize carry to 0

        // Traverse both lists until both are exhausted
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            // Add value from l1 if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add value from l2 if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Calculate new carry and the digit to store
            carry = sum / 10;
            int digit = sum % 10;

            // Add the digit to the new linked list
            current.next = new ListNode(digit);
            current = current.next; // Move to the next node
        }

        return dummy.next; // Return the head of the new list
    }
}
