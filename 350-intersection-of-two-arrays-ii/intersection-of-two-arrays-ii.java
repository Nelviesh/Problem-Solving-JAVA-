import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        // Count occurrences of each element in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check for intersection with nums2
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1); // Decrement the count
            }
        }

        // Convert List<Integer> to int[]
        return intersection.stream().mapToInt(i -> i).toArray();
    }
}
