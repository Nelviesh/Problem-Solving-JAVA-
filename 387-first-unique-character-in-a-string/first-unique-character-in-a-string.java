class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Count frequencies of characters
        int[] charCount = new int[26]; // For 26 lowercase English letters

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++; // Increment frequency
        }

        // Step 2: Find the first unique character by traversing the string
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i; // Return the index of the first unique character
            }
        }

        return -1; // No unique character found
    }
}
