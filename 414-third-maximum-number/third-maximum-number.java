class Solution {
    public int thirdMax(int[] nums) {
        // Use three variables to keep track of the top 3 maximums
        Integer max1 = null, max2 = null, max3 = null;

        for (int num : nums) {
            // Skip if this number is already considered
            if ((max1 != null && num == max1) || 
                (max2 != null && num == max2) || 
                (max3 != null && num == max3)) {
                continue;
            }

            // Update the top 3 maximums
            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || num > max3) {
                max3 = num;
            }
        }

        // If we have at least 3 unique maximums, return the third
        return max3 != null ? max3 : max1;
    }
}
