class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for (int student : students) {
            queue.offer(student);
        }

        // Initialize a stack for sandwiches
        Stack<Integer> stack = new Stack<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) { // Reverse order for stack
            stack.push(sandwiches[i]);
        }

        // Simulation of the queue and stack process
        int rotation = 0; // Tracks consecutive unmatched rotations
        while (!queue.isEmpty() && rotation < queue.size()) {
            int student = queue.poll(); // Get the student at the front
            int sandwich = stack.peek(); // Look at the top sandwich

            if (student == sandwich) {
                stack.pop(); // Match found, remove sandwich
                rotation = 0; // Reset rotation count
            } else {
                queue.offer(student); // Requeue the student to the back
                rotation++; // Increment unmatched rotation count
            }
        }
        return queue.size();
    }
}