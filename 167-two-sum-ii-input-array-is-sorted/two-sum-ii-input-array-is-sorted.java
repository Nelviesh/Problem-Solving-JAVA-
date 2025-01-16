class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0; // Start pointer
        int j = numbers.length - 1; // End pointer
        int[] array=new int[2];
        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
               array[0]=i+1;
               array[1]=j+1;
               break; // Return 1-based indices
            } else if (sum < target) {
                i++; // Move start pointer forward to increase the sum
            } else {
                j--; // Move end pointer backward to decrease the sum
            }
        }

        return array;
    }
}
