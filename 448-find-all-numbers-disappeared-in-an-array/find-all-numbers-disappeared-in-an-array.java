class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        Set<Integer> numbers= Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<n;i++){
            if (!numbers.contains(i+1)){
                list.add(i+1);
            }
        }
        return list;
    }
}