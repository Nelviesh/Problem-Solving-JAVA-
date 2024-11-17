class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        
        int size=n-k;
        int max=Integer.MIN_VALUE;
        if(n==1){
            return nums[0];
            
        }

        for(int i=0;i<=size;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum+=nums[i+j];

            }
            max=Math.max(max,sum);

        }
        double avg=max/(double)k;
        return avg;
    }
}