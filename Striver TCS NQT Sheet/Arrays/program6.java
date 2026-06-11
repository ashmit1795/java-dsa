/*
Problem Statement: Rearrange a given array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order.

Input: [8 7 1 6 5 9]
Output: [1 5 6 9 8 7]
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Input: [4 2 8 6 15 5 9 20]
Output: [2 4 5 6 20 15 9 8]
Explanation: First four elements are in the ascending order and next four elements are in the descending order.
*/

import java.util.Arrays;

class program6 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 8, 6, 15, 5, 9, 20 };
        // int[] arr = { 8, 7, 1, 6, 5, 9 };
        
        Arrays.sort(arr);

        int n = arr.length;

        reverse(arr, n/2, n - 1);

        System.out.println(Arrays.toString(arr));
    }
    
    static void reverse(int[] arr, int startIdx, int endIdx) {
        int i = startIdx;
        int j = endIdx;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
