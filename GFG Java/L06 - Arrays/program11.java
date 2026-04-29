/*
Ques: Segregate 0s and 1s

Given an array arr[] consisting of only 0's and 1's. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

Input: arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 0, 0, 1, 1, 1, 1, 1].

Input: arr[] = [1, 1]
Output: [1, 1]
Explanation: There are no 0s in the given array, so the modified array is [1, 1]

*/

import java.util.Scanner;

class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        segregate0and1(arr);

        System.out.print("After Segregation of 0s and 1s: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        sc.close();
    }

    // ! Approach 1 - Two Pass Solution
    static void segregate0and1(int[] arr, int d) {
        // code here
        int countOfZeroes = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                countOfZeroes++;
        }
        for (int i = 0; i < countOfZeroes; i++)
            arr[i] = 0;
        for (int i = countOfZeroes; i < n; i++)
            arr[i] = 1;
    }
    
    // ! Approach 2 - One pass solution
    static void segregate0and1(int[] arr) {
        // code here
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0)
                i++;
            if (arr[j] == 1)
                j--;
            if (i == j + 1)
                break;
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
}
