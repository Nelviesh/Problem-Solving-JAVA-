class Solution {
    public int compress(char[] chars) {
        int i = 0;int ind=0;
        while(i<chars.length){
            char c  = chars[i];
            int count=0;
            while(i<chars.length && c==chars[i]){
                i++;count++;
            }
            chars[ind++]=c;
            if(count>1){
                for(char c1 : String.valueOf(count).toCharArray()){
                    chars[ind++]=c1;
                }
            }

        }
        return ind;
    }
}