class Solution {
    public int maxVowels(String s, int k) {
      char[] s1=s.toCharArray();
        
        int size=s1.length;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        int max;
        int count=0;

        for(int i=0;i<k;i++){
           if(set.contains(s1[i])){
            count++;
           }
        }
         max=count;
        for(int j=k;j<size;j++){
            if(set.contains(s1[j-k])){
            count--;}
        
        if(set.contains(s1[j])){
        count++;}
        max=Math.max(count,max);
    
    }
        return max;  
    }
}