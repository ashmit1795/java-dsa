/*
Problem Statement: Given an array, we have found the number of occurrences of each element in the array.

Example 1:

Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
        5  2
        15  1
Explanation: 10 occurs 3 times in the array
            5 occurs 2 times in the array
            15 occurs 1 time in the array

Example2:

Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
        3  1
        4  2
Explanation: 2 occurs 3 times in the array
            3 occurs 1 time in the array
            4 occurs 2 time in the array
*/

import java.util.HashMap;
import java.util.Map;

class program5 {
    public static void main(String[] args) {
        // int[] arr = { 1, 1, 1, 1, 0, 0, 0 };
        int[] arr = {2, 2, 3 ,4 ,4 ,2};
        
        countFrequency(arr);
        frequency(arr);
    }
    
    static void countFrequency(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times in the array");
        }
    }

    // OPTIMAL APPROACH
    static void frequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Traverse through the HashMap and print frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}