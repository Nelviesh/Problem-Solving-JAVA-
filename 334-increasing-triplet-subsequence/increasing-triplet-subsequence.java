class Solution {
    public boolean increasingTriplet(int[] nums) {
          int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        // Iterate through the array
        for (int num : nums) {
            if (num <= first) {
                first = num; // Update first to the smallest value encountered
            } else if (num <= second) {
                second = num; // Update second to the next smallest value
            } else {
                // If a number greater than second is found, return true (we found a triplet)
                return true;
            }
        }
        
        // No increasing triplet found
        return false;
    }
}