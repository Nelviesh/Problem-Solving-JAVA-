class Solution {
    public int findMiddleIndex(int[] nums) {
        int n= nums.length;
        int Leftsum=0;
        int Rightsum=0;
        for (int i=0;i<n;i++){
            Rightsum+=nums[i];
        }
        for (int j=0;j<n;j++){
            Rightsum-=nums[j];
            if (Rightsum==Leftsum){
                
                return j;
            }
            Leftsum+=nums[j];

        }
        return -1;
    }
}