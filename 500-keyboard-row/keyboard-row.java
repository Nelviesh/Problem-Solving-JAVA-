import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";
        int count = 0;

        // Creating lists for each row of the keyboard
        List<Character> list1 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            list1.add(str1.charAt(i));
        }

        List<Character> list2 = new ArrayList<>();
        for (int i = 0; i < str2.length(); i++) {
            list2.add(str2.charAt(i));
        }

        List<Character> list3 = new ArrayList<>();
        for (int i = 0; i < str3.length(); i++) {
            list3.add(str3.charAt(i));
        }

        // Check each word
        List<String> validWords = new ArrayList<>();
        for (String str : words) {
            List<Character> list = new ArrayList<>();
            for (int j = 0; j < str.length(); j++) {
                list.add(Character.toLowerCase(str.charAt(j)));  // Convert to lower case
            }

            // Check if all characters of the word are in the same row
            if (list1.containsAll(list) || list2.containsAll(list) || list3.containsAll(list)) {
                validWords.add(str);
            }
        }

        // Convert the List of valid words to an array
        return validWords.toArray(new String[0]);
    }
}
