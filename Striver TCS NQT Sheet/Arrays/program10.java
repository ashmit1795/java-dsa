/*
Problem Statement: Given an unsorted array, find the median of the given array.

Example 1:
Input:
    [2,4,1,3,5]
Output:
    3

Example 2:
Input:
    [2,5,1,7]
Output:
    3.5
*/

import java.util.Arrays;

class program10 {
    public static void main(String[] args) {
        // int[] arr = { 2, 4, 1, 3, 5 };
        int[] arr = { 2, 5, 1, 7 };
        
        findMedian(arr);

    }
    
    static void findMedian(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        if (n % 2 == 0) {
            int idx1 = n / 2;
            int idx2 = (n / 2) - 1;
            System.out.println((double) (arr[idx1] + arr[idx2])/2);
        } else {
            System.out.println(arr[n/2]);
        }
    }
}
