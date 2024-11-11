class Solution {
    public String reverseVowels(String s) {
        
        char[] chars=s.toCharArray();
        int n=chars.length;
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int i=0,j=n-1;
        while (i<j){
            while(i<j&&!set.contains(chars[i])){
                i++;
            }
            while(i<j&&!set.contains(chars[j])){
                j--;
            }
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
        String ss=new String(chars);
        return(ss);
    }
}