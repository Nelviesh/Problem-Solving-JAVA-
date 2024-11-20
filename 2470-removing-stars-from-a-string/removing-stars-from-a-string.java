class Solution {
    public String removeStars(String s) {
        StringBuffer str=new StringBuffer();
        int n=s.length();
        Stack<Character>  stack= new Stack<>();
        int i=0;
        while (i<n){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();


            }
            i++;
        }

        for (Character ch : stack) {
            str.append(ch);
        }
        return str.toString();
    }
}