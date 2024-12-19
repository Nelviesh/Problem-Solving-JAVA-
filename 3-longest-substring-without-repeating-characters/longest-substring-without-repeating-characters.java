class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size=s.length();
        int i=0;
        int tot=0;
        List<Character> list=new ArrayList<>();
        while(i<size){
            int j=i;
            while(j<size && !list.contains(s.charAt(j))){
                list.add(s.charAt(j));
                j++;
            }
            int temp= list.size();
            tot=Math.max(temp,tot);
            list.clear();
            i++;

        }
        return tot;
    }
}