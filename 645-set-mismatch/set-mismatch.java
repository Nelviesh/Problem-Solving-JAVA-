class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2]; // Array to store duplicate and missing numbers
        int i = 0;

        // Cyclic sort to place numbers at their correct positions
        while (i < n) {
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
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                result[0] = nums[i];   // Duplicate number
                result[1] = i + 1;     // Missing number
                break;
            }
        }

        return result;
    }
}
