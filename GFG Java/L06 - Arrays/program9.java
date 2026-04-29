/*
Ques: Given an array arr[] . Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes [3, 4, 5, 1, 2].

*/

import java.util.Scanner;

class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter start 'd': ");
        int d = sc.nextInt();

        // ! Approach 1 - Time Complexity = O(n^2)
        // while (d > 0) {
        //     int temp = arr[0];
        //     for (int i = 1; i < n; i++) {
        //         arr[i - 1] = arr[i];
        //     }
        //     arr[n - 1] = temp;
        //     d--;
        // }

        // ! Approach 2 - Time Complexity = O(n)
        /*
            Explaination of the approach
            arr = [1,2,3,4,5]
            n = 5
            d = 2
            Desired: arr = [3,4,5,1,2]
            1. reverse(arr, 0, (d - 1)):
                arr = [2,1,3,4,5]
            2. reverse(arr, d, (n - 1)):
                arr = [2,1,5,4,3]
            3. reverse(arr, 0, (n - 1)):
                arr = [3,4,5,1,2]
        */
        d = d % n; // if n = 5, d = 34 -> d = d % n = 34 % 5 = 4, so the rotation will happen 4 times only
        reverse(arr, 0, (d - 1));
        reverse(arr, d, (n - 1));
        reverse(arr, 0, (n - 1));
        

        for (int element : arr) {
            System.out.print(element + " ");
        }

        sc.close();
    }
    
    static void reverse(int arr[], int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
