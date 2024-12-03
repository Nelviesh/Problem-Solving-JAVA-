import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        // Mark each number as visited by flipping the sign of the number at its corresponding index
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1; // Convert number to index (1-based to 0-based)
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // Mark as visited
            }
        }

        // Collect indices of numbers that were not visited
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) { // Positive value means the number (i+1) was not visited
                result.add(i + 1);
            }
        }

        return result;
    }
}
