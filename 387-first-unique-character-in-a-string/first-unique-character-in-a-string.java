import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Count the frequency of each character
        HashMap<Character, Integer> charCount = new HashMap<>();
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

            // Add character and its index to the queue
            queue.offer(new int[] {c, i});
        }

        // Step 2: Process the queue to find the first unique character
        while (!queue.isEmpty()) {
            int[] front = queue.poll();
            char c = (char) front[0];
            int index = front[1];

            if (charCount.get(c) == 1) {
                return index; // First unique character found
            }
        }

        return -1; // No unique character found
    }
}
