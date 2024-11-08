class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int n= candies.length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (candies[i]>max){
                max=candies[i];

            }
        }
        
        List<Boolean> list= new ArrayList<>();
        int m;
        for(int j=0;j<n;j++){
            m=candies[j]+extraCandies;
            if(m>=max){
                list.add(true);
            }
            else {
                list.add(false);
            }

        }
        return list;
    }
}