/*
Problem Statement: Given an array arr of size n, the task is to find the sum of all the elements in the array .
Input: N = 5, array[] = {1,2,3,4,5}
Output: 15
Explanation: Sum of all the elements is 1+2+3+4+5 = 15

Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 11
Explanation: Sum of all the elements is 1+2+1+1+5+1 = 11
*/

class program7 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 5, 1 };
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of all the elements is: " + sum);
    }
}
