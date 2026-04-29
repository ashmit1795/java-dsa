/*
You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.

Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.

Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.
*/

import java.util.Scanner;

class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Missing element: " + missingNum(arr));

        sc.close();
    }
    
    static int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;
        int sumOfFirstN = (n * (n + 1)) / 2; // there might be overflow in case of large numbers, so multiplication is not suitable, otherwise use long data type
        int sum = 0;
        for(int i = 0; i < arr.length; i++) sum += arr[i];
        
        return (sumOfFirstN - sum);
    }
}
