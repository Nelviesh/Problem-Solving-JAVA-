class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int a=str1.length();
        int b=str2.length();
        int k=0;
        if(a>b){
            k=GCD(a,b);
            return str1.substring(0,k);
        }
        else{
            k=GCD(b,a);
            return str2.substring(0,k);
        }
    }
    public static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return GCD(b,a%b);
        }
    }
}