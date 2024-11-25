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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null||head.next==null) {
            return null; // Empty list
        }
        
       ListNode slow = head;
        ListNode fast = head;
        ListNode slowprev=null;

        while (fast!=null && fast.next!=null) {
            slowprev=slow;
            slow=slow.next;
            fast=fast.next.next;
            // Move current forward
        }
        slowprev.next=slow.next;


        return head; 
    }
}