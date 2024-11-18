class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         Map<Integer,Integer> map= new HashMap<>();
        for (int i=0;i< arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        int n=map.size();
        int[] newarr = new int[n];
        int index = 0;
        for (int value : map.values()) {
            newarr[index++] = value;
        }
        Arrays.sort(newarr);
        for(int i=0;i<n-1;i++){
            if (newarr[i]==newarr[i+1]){
                return false;
            }
        }
        return true;
    }
}