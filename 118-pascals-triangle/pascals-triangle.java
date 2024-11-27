class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> pascalsTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            // Create a new row
            List<Integer> row = new ArrayList<>();

            // Add the first element
            row.add(1);

            // Fill the inner elements of the row
            for (int j = 1; j < i; j++) {
                List<Integer> prevRow = pascalsTriangle.get(i - 1); // Get the previous row
                row.add(prevRow.get(j - 1) + prevRow.get(j)); // Add values from the previous row
            }

            // Add the last element if the row has more than one element
            if (i > 0) {
                row.add(1);
            }

            // Add the row to the triangle
            pascalsTriangle.add(row);
        }

        return pascalsTriangle;  
    }
}