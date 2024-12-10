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
            list2.add(str2.charAt(i));  // Fixed: was adding to list1, changed to list2
        }

        List<Character> list3 = new ArrayList<>();
        for (int i = 0; i < str3.length(); i++) {
            list3.add(str3.charAt(i));  // Fixed: was adding to list1, changed to list3
        }

        // Array of words to check
        

        // Check each word
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            List<Character> list = new ArrayList<>();
            for (int j = 0; j < str.length(); j++) {
                list.add(Character.toLowerCase(str.charAt(j)));  // Convert to lower case to avoid case issues
            }

            // Check if all characters are in the same row of the keyboard
            if (list1.containsAll(list)) {
                words[count] = str;
                count++;
            } else if (list2.containsAll(list)) {
                words[count] = str;
                count++;
            } else if (list3.containsAll(list)) {
                words[count] = str;
                count++;
            }
        }
        String[] result=new String[count];
        for (int v = 0; v < count; v++) {
            result[v]=words[v];
        }
        return result;
    }
}