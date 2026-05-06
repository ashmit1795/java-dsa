/*
Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1. 

Note: If multiple occurrences are there, please return the smallest index.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: 3
Explanation: 4 appears at index 3.

Input: arr[] = [11, 22, 33, 44, 55], k = 445
Output: -1
Explanation: 445 is not present.

Input: arr[] = [1, 1, 1, 1, 2], k = 1
Output: 0
Explanation: 1 appears at index 0.

*/

import java.util.Scanner;

class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int found = binarySearch(arr, target);
        if (found == -1) {
            System.out.println("Target element not found.");
        } else {
            System.out.println("Taget element found at index: " + found);
        }

        sc.close();
    }

    // Brute-Force Approach
    // static int binarySearch(int arr[], int target) {
    //     int n = arr.length;
    //     int low = 0, high = n - 1;
    //     int found = -1;
    //     while (low <= high) {
    //         int mid = ((low + high) / 2);
    //         if (arr[mid] == target) {
    //             found = mid;
    //             break;
    //         } else if (arr[mid] < target) {
    //             low = mid + 1;
    //         } else if (arr[mid] > target) {
    //             high = mid - 1;
    //         }
    //     }

    //     if (found != -1) {
    //         while (found != 0 && arr[found - 1] == arr[found]) {
    //             found--;
    //         }
    //     }

    //     return found;
    // }

    // optimal
    static int binarySearch(int arr[], int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int found = -1;
        while (low <= high) {
            int mid = ((low + high) / 2);
            if (arr[mid] == target) {
                found = mid; // store answer
                // high = mid - 1; // go left
                low = mid + 1;// go right
            } else if (arr[mid] < target) {
                low = mid + 1; // go right
            } else if (arr[mid] > target) {
                high = mid - 1; // go left
            }
        }

        return found;
    }

}