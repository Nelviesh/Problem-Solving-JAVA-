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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // If the list is empty or has only one node, return as is
        }

        ListNode odd = head;             // Pointer for odd-indexed nodes
        ListNode even = head.next;       // Pointer for even-indexed nodes
        ListNode evenHead = even;        // Store the head of the even-indexed list

        while (even != null && even.next != null) {
            odd.next = even.next;        // Link odd nodes
            odd = odd.next;             // Move odd pointer forward
            even.next = odd.next;       // Link even nodes
            even = even.next;           // Move even pointer forward
        }

        odd.next = evenHead;            // Connect the end of odd list to the even list
        return head;
    }
}