//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // testcases
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            // size of array
            int N = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            // adding elements to the array
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int P = Integer.parseInt(br.readLine().trim());
            // calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P);

            // printing array elements
            for (int i = 0; i < N; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
         int[] B = new int[N]; // Array to store frequencies

        // Create a HashMap to store the frequency of each number
        Map<Integer, Integer> map = new HashMap<>();

        // Count the occurrences of each number in the array v
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Initialize the array N to 0 (although it's already initialized by default)
        // Populate the array N with counts from the map
        for (int j = 0; j < N; j++) {
            if (map.containsKey(j+1)) {
                arr[j] = map.get(j+1);
            } else {
                arr[j] = 0;
            }
        }
        
    }
}
