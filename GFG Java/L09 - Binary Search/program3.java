/*
Given a sorted array arr[] with possibly some duplicates, find the first and last occurrences of an element x in the given array.

Note: If the number x is not found in the array then return both the indices as -1.

Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5

Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
Output: [6, 6]
Explanation: First and last occurrence of 7 is at index 6

Input: arr[] = [1, 2, 3], x = 4
Output: [-1, -1]
Explanation: No occurrence of 4 in the array, so, output is [-1, -1]

*/

import java.util.ArrayList;
import java.util.Scanner;

class program3 {
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

        ArrayList<Integer> result = find(arr, target);

        System.out.println(result);

        sc.close();
    }

    static ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        result.add(binarySearch(arr, x, 1));
        result.add(binarySearch(arr, x, 0));
        
        return result;
    }
    
    static int binarySearch(int arr[], int target, int first) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int found = -1;
        while (low <= high) {
            int mid = ((low + high) / 2);
            if (arr[mid] == target) {
                found = mid; // store answer
                if (first == 1) {
                    high = mid - 1; // go left
                } else {
                    low = mid + 1;// go right
                }
            } else if (arr[mid] < target) {
                low = mid + 1; // go right
            } else if (arr[mid] > target) {
                high = mid - 1; // go left
            }
        }
        
        return found;
    }

}