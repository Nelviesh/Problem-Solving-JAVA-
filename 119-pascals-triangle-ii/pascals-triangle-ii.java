class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        
        for (int i = 0; i <= rowIndex; i++) { // Loop until rowIndex (inclusive)
            List<Integer> row = new ArrayList<>();
            row.add(1); // Add the first element of the row
            
            for (int j = 1; j < i; j++) {
                List<Integer> prevRow = pascalTriangle.get(i - 1); // Get the previous row
                row.add(prevRow.get(j - 1) + prevRow.get(j)); // Compute and add the new element
            }
            
            if (i > 0) {
                row.add(1); // Add the last element of the row
            }
            
            pascalTriangle.add(row); // Add the row to the triangle
        }
        
        // Return the row at the specified index
        return pascalTriangle.get(rowIndex);
    }
}
