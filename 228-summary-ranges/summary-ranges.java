class Solution {
    public List<String> summaryRanges(int[] nums) {
        int size = nums.length;
        List<String> list = new ArrayList<>();
        
        int i = 0;

        while (i < size) {
            // Start a new range
            int start = nums[i];
            int end = start;

            // Find the end of the current range
            while (i + 1 < size && nums[i + 1] == nums[i] + 1) {
                i++;
                end = nums[i];
            }

            // Add the range to the result
            if (start == end) {
                list.add(String.valueOf(start)); // Single element
            } else {
                list.add(start + "->" + end); // Range
            }

            // Move to the next element
            i++;
        }
        return list;
    }
}
