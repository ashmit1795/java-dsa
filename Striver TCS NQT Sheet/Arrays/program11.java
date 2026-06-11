/*
Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Input: arr[]=[1,1,2,2,2,3,3]
Output: [1,2,3,_,_,_,_]
Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Input: arr[]=[1,1,1,2,2,3,3,3,3,4,4]
Output: [1,2,3,4,_,_,_,_,_,_,_]
Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.
*/

import java.util.Arrays;
import java.util.HashSet;

class program11 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3 };

        System.out.println("Before: " + Arrays.toString(arr));
        removeDuplicates(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }

    // static void removeDuplicates(int[] arr) {
    //     int i = 0;
    //     int n = arr.length;
    //     for (int j = 1; j < n; j++) {
    //         if (arr[i] != arr[j]) {
    //             i++;
    //             arr[i] = arr[j];
    //         }
    //     }

    //     System.out.println("Total unique elements: " + (i + 1));
    // }

    static void removeDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();

        int idx = 0;
        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                arr[idx] = num;
                idx++;
            }
        }

        System.out.println("Total unique elements: " + idx);
    }

}
