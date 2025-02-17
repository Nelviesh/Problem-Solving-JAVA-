class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int i=0;
        int j=i+1;
        while (i<n-1){
            if ((nums[i]+nums[j])==target){
                return new int[] {i,j};
            }
            j++;
            if (j-1>=n-1){
                i++;
                j=i+1;
            }
        }
        return null;
        
    
    }
    
}