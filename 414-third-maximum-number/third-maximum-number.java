import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int thirdMax(int[] nums) {
        // Convert the array to a Set to remove duplicates
        Set<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        // If there are fewer than 3 unique numbers, return the maximum
        if (numbers.size() < 3) {
            return Collections.max(numbers);
        }

        // Find the third maximum by repeatedly removing the largest element
        for (int i = 0; i < 2; i++) {
            int max = Collections.max(numbers);
            numbers.remove(max);
        }

        // The third maximum is now the largest number in the remaining set
        return Collections.max(numbers);
    }
}
