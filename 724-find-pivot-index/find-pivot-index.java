class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
        int sum=0;
        for (int i=0;i<n;i++){
                sum+=nums[i];
        }
        int j=0;
        int prefsum=0;
        while(j<n){
            int k=prefsum+nums[j];
            if(prefsum==sum-k){
                return j;
            }
            prefsum+=nums[j];
            j++;
        }
        return -1;
    }
}