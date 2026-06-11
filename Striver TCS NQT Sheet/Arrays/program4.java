/*
Problem Statement: You are given an array. The task is to reverse the array and print it.

Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Input: N=4 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.


*/

import java.util.Arrays;

public class program4 {
    public static void main(String[] args) {
        // int[] arr = { 40, 30, 20, 10 };
        // int[] arr = {5,4,3,2,1};
        int[] arr = {1, 1, 1, 1, 0, 0, 0};

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
