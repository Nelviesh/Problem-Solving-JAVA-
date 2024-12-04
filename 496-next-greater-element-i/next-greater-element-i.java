class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] result = new int[n1];

        for (int i = 0; i < n1; i++) {
            int val = nums1[i];
            boolean found = false; // To track if we find `val` in nums2

            for (int j = 0; j < n2; j++) {
                if (nums2[j] == val) {
                    found = true;
                }
                // Once found, look for the next greater element
                if (found && nums2[j] > val) {
                    result[i] = nums2[j];
                    found = false; // Reset since we've found the next greater
                    break;
                }
            }
            // If no greater element is found, set result to -1
            if (found) {
                result[i] = -1;
            }
        }

        return result;
    }
}
