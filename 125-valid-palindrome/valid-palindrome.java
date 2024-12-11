class Solution {
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        char[] charArray = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        int i = 0;
        int j = charArray.length - 1;

        // Check for palindrome
        while (i < j) {
            if (charArray[i] != charArray[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
