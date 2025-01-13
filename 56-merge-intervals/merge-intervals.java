import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Initialize with the first interval
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            // Get the last interval in the merged list
            int currentEnd = currentInterval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (nextStart <= currentEnd) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, add the next interval
                currentInterval = intervals[i];
                merged.add(currentInterval);
            }
        }

        // Convert the list back to a 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }
}
