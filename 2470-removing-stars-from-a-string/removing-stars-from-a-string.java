class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char ch : s.toCharArray()) {
            if (ch != '*') {
                // Append non-star characters
                result.append(ch);
            } else if (result.length() > 0) {
                // Remove the last character if '*' is encountered
                result.setLength(result.length() - 1);
            }
        }

        // Convert StringBuilder to String and return
        return result.toString();
    }
}
