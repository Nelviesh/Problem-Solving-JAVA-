import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2]; // Array to store [duplicate, missing]
        
        Arrays.sort(nums); // Sort the array
        
        int duplicate = -1, missing = 1; 
        
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i]; // Found duplicate
            } else if (nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1; // Found missing number
            }
        }

        // If the missing number is at the end (e.g., [1,2,3,3])
        if (nums[n - 1] != n) {
            missing = n;
        }

        result[0] = duplicate;
        result[1] = missing;
        return result;
    }
}
