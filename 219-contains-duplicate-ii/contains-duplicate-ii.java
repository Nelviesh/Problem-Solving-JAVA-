import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If the current element is already in the set, we found a duplicate
            if (window.contains(nums[i])) {
                return true;
            }

            // Add the current element to the set
            window.add(nums[i]);

            // Maintain the sliding window size <= k
            if (window.size() > k) {
                window.remove(nums[i - k]); // Remove the element that is out of the window
            }
        }

        return false; // No duplicates found within the given distance
    }
}
