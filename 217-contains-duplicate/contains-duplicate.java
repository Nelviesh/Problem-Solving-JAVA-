class Solution {
    public boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        while (i < n - 1) {
            if (nums[i] == nums[i + 1]) {
                return true;
            } else {
                i++;
            }

        }
        return false;
    }
}