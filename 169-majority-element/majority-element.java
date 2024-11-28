class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> HM = new HashMap<>();
        
        // Count occurrences of each number
        for (int x : nums) {
            HM.put(x, HM.getOrDefault(x, 0) + 1);
        }
        
        // Find the majority element
        int majorityCount = nums.length / 2;
        for (int key : HM.keySet()) {
            if (HM.get(key) > majorityCount) {
                return key;
            }
        }
        
        // This line is unreachable if input guarantees a majority element
        return -1; 
    }
}