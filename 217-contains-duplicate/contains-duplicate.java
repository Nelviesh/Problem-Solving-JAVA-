class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (!numSet.add(num)) { // add() returns false if the element is already present
                return true; // Return immediately if a duplicate is found
            }
        }
        return false; // No duplicates found
    }
}