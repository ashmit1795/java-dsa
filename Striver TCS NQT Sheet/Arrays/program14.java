/*
Problem Statement: Find all the repeating elements present in an array.

Example 1:
Input:
    Arr[] = [1,1,2,3,4,4,5,2]
Output:
    1,2,4
Explanation:
    1,2 and 4 are the elements which are occurring more than once.

Example 2:
Input:
    Arr[] = [1,1,0]
Output:
    1
Explanation:
    Only 1 is occurring more than once in the given array.
*/

import java.util.HashMap;
import java.util.Map;

class program14 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 4, 5, 2 };
        // int[] arr = { 1, 1, 2, 2, 2, 3, 3 };

        findRepeatingElements(arr);
    }

    // static void findRepeatingElements(int[] arr) {
    //     Arrays.sort(arr);  // Sort the array to easily find duplicates

    //     System.out.print("The repeating elements are: ");
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         // If current element is equal to next element, it's a repeating element
    //         if (arr[i] == arr[i + 1]) {
    //             System.out.print(arr[i] + " ");
    //         }
    //     }
    // }

    static void findRepeatingElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency Counting
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        System.out.println(map.entrySet()); // [1=2, 2=2, 3=1, 4=2, 5=1]

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // System.out.println(entry.getKey() + " : " + entry.getValue());
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

}