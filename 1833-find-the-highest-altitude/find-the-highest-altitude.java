class Solution {
    public int largestAltitude(int[] gain) {
         int n= gain.length;
        int sum=0;
        int max=0;

        for(int i=0;i<n;i++){
            int prev=gain[i];
            gain[i]=sum+prev;
            sum+=prev;



            max=Math.max(max,sum);
        }
        return max;
    }
}