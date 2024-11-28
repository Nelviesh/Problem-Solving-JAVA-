class Solution {
    public int missingNumber(int[] nums) {
         Arrays.sort(nums);
        int size=nums[nums.length-1];
        for (int i=0;i<size;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}