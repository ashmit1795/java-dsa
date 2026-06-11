/*
Problem Statement: Given an array arr of size n, the task is to find the average of all the elements in the array .

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 3
Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+3+4+5)/5 = 3.


Example 2:
Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 1.8
Explanation: Average is the sum of all the elements divided by number of elements.Therefore (1+2+1+1+5+1)/6 = 1.8
*/

class program9 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 5, 1 };
        double sum = 0;
        double n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = sum / n;

        System.out.println("Average of all the elements is: " + avg);
    }
}
