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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Merge the nodes of the two lists while both lists have elements
        while (list1 != null && list2 != null) {
            // Compare the values of list1 and list2, and attach the smaller one to the merged list
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If list1 is exhausted, append the remaining nodes of list2
        if (list1 != null) {
            current.next = list1;
        }
        // If list2 is exhausted, append the remaining nodes of list1
        if (list2 != null) {
            current.next = list2;
        }

        // Return the merged list, which starts after the dummy node
        return dummy.next;
        
    }
}