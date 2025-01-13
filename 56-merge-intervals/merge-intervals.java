class Solution {
    public int[][] merge(int[][] intervals) {
        

        // Sort intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] merged = new int[intervals.length][2];
        int k = 0; // Pointer for the merged array

        // Initialize the first interval
        merged[k][0] = intervals[0][0];
        merged[k][1] = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= merged[k][1]) {
                // Overlapping intervals, merge them
                merged[k][1] = Math.max(merged[k][1], intervals[i][1]);
            } else {
                // No overlap, move to the next interval
                k++;
                merged[k][0] = intervals[i][0];
                merged[k][1] = intervals[i][1];
            }
        }
        return Arrays.copyOfRange(merged, 0, k + 1);
    }
}