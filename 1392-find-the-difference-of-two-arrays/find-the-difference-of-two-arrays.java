class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(!map2.containsKey(entry.getKey())){
                list.get(0).add(entry.getKey());
            }
        }
        for(Map.Entry<Integer, Integer> entry : map2.entrySet()){
            if(!map.containsKey(entry.getKey())){
                list.get(1).add(entry.getKey());
            }
        }
        return list;
    }
}