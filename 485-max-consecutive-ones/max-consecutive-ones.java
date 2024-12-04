class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int n = nums.length;
        int maxim = 0;
        int i = 0;

        while (i < n) {
            int count = 0;

            // Check for consecutive 1s
            while (i < n && nums[i] == 1) {
                count++;
                i++;
            }
            
            // Update the maximum count
            maxim = Math.max(maxim, count);

            // Skip 0s
            i++;
        }
        return maxim;
    }
}