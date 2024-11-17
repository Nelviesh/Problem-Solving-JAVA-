class Solution {
    public int maxOperations(int[] nums, int k) {
        int j= nums.length-1;
        Arrays.sort(nums);
        int i=0;
        int pairs=0;
        while(i<j){
        if(nums[i]+nums[j]==k){
        pairs++;
        i++;j--;}
        else if(nums[i]+nums[j]>k){
            j--;
        }
        else{
            i++;}
            }
        return pairs;
    }
}