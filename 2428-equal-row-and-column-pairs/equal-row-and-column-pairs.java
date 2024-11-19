class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        // Compare each row with each column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isEqual = true;

                // Check if row `i` is equal to column `j`
                for (int k = 0; k < n; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        isEqual = false;
                        break;
                    }
                }

                if (isEqual) {
                    count++;
                }
            }
        }
        return count;

    }
}