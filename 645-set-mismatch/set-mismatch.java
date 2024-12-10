class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;

        // Cyclic sort to place numbers at their correct positions
        for (int i = 0; i < n; ) {
            if (nums[i] != nums[nums[i] - 1]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            } else {
                i++;
            }
        }

        // Find the duplicate and missing numbers
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};
            }
        }

        return new int[]{-1, -1}; // Fallback, should not reach here
    }
}
