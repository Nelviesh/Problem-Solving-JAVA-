import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Use a Set to store unique elements from nums1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Use another Set to store the intersection
        Set<Integer> intersection = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the Set to an int array
        int size = intersection.size();
        int[] inter = new int[size];
        
        int index = 0;
        for (int num : intersection) {
            inter[index++] = num;
        }

        return inter;
    }
}
