class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int bestI = values[0]; // Maximum value of values[i] + i seen so far

        for (int j = 1; j < values.length; j++) {
            // Calculate the score for the current pair
            maxScore = Math.max(maxScore, bestI + values[j] - j);
            // Update bestI for the next iteration
            bestI = Math.max(bestI, values[j] + j);
        }

        return maxScore;
    }
}
