import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            // Remove characters from the left until there are no duplicates
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            set.add(s.charAt(right));

            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
