import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int complement = -nums[i] - nums[j];
                if (seen.contains(complement)) {
                    // Form the triplet
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    // Sort the triplet to handle duplicates
                    triplet.sort(null);
                    result.add(triplet);
                } else {
                    seen.add(nums[j]);
                }
            }
        }

        return new ArrayList<>(result);
    }
}
