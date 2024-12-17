import java.math.BigInteger;



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Convert ListNode l1 to a string in reverse order
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        while (l1 != null) {
            str1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            str2.append(l2.val);
            l2 = l2.next;
        }

        // Reverse the strings to get the actual numbers
        str1.reverse();
        str2.reverse();

        // Use BigInteger to handle large numbers
        BigInteger num1 = new BigInteger(str1.toString());
        BigInteger num2 = new BigInteger(str2.toString());

        // Sum the two numbers
        BigInteger sum = num1.add(num2);

        // Convert the sum back into a string and reverse it
        String sumStr = new StringBuilder(sum.toString()).reverse().toString();

        // Construct the resulting linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (char c : sumStr.toCharArray()) {
            current.next = new ListNode(Character.getNumericValue(c));
            current = current.next;
        }

        return dummy.next;
    }
}
