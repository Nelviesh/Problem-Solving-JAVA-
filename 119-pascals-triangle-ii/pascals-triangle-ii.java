class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // The first element is always 1

        for (int i = 1; i <= rowIndex; i++) {
            // Compute the current row in reverse to avoid overwriting values prematurely
            for (int j = row.size() - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // Add the last element of the current row
        }

        return row;
    }
}

