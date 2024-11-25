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

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // This will become the new head
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // Store the next node
            current.next = prev;             // Reverse the current node's pointer
            prev = current;                  // Move prev to the current node
            current = nextNode;              // Move to the next node in the list
        }

        // At the end, prev will point to the new head
        return prev;
    }
}
