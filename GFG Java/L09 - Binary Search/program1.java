/*
Binary Search
*/

import java.util.Scanner;

class program1 {
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

        // int found = binarySearch(arr, target);
        int found = recursiveBinarySearch(arr, 0, n - 1, target);
        if (found == -1) {
            System.out.println("Target element not found.");
        } else {
            System.out.println("Taget element found at index: " + found);
        }

        sc.close();
    }

    static int binarySearch(int arr[], int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Recursive binary search
    static int recursiveBinarySearch(int[] arr, int low, int high, int target) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target) {
                return recursiveBinarySearch(arr, mid + 1, high, target);
            } else {
                return recursiveBinarySearch(arr, low, mid - 1, target);
            }
        }

        return -1;
    }
}