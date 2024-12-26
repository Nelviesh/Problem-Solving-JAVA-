class Solution {
    public String longestPalindrome(String s) {
        String longest="";
        for (int i=0;i<s.length();i++) {
            String oddlen = expandaround(s, i, i);
            String evenlen = expandaround(s, i, i + 1);
            if(oddlen.length()>longest.length()){
                longest=oddlen;
            }
            if (evenlen.length()>longest.length()){
                longest=evenlen;
            }
        }
        return longest;
    }
    public static String expandaround(String s,int left,int right){
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;

        }
        return s.substring(left+1,right);
    }
}