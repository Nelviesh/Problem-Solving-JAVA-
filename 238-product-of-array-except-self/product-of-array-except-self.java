class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        // Step 1: Calculate prefix products
        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = prefixProduct; // Store the current prefix product
            prefixProduct *= nums[i]; // Update prefix product for the next iteration
        }
        
        // Step 2: Calculate suffix products and multiply with the prefix products
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffixProduct; // Multiply the stored prefix product with the suffix product
            suffixProduct *= nums[i]; // Update suffix product for the next iteration
        }
        
        return ans;
    }
}
