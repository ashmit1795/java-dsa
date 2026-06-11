/*
Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

Input : N = 5, array[] = {1, 2, 3, 4, 5}, K = 2
Output (Left Rotation) : {3, 4, 5, 1, 2}
Explanation : After rotating left by 2, the first two elements move to the end.

Input : N = 5, array[] = {1, 2, 3, 4, 5}, K = 2
Output (Right Rotation) : {4, 5, 1, 2, 3}
Explanation : After rotating right by 2, the last two elements move to the start.
*/

import java.util.Arrays;

class program8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // leftRotation(arr, 2);
        rightRotation(arr, 2);

        System.out.println(Arrays.toString(arr));
    }

    static void leftRotation(int[] arr, int k) {
        int n = arr.length;

        while (k > 0) {
            int temp = arr[0];
            for (int i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }

            arr[n - 1] = temp;
            k--;
        }
    }

    static void rightRotation(int[] arr, int k) {
        int n = arr.length;

        while (k > 0) {
            int temp = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = temp;
            k--;
        }
    }
}
