class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0; // The farthest position we can reach

        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond the farthest we can reach, return false
            if (i > farthest) {
                return false;
            }

            // Update the farthest position we can reach
            farthest = Math.max(farthest, i + nums[i]);

            // If we can reach or exceed the last index, return true
            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}
