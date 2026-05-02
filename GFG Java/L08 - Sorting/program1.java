/*
Check if array is sorted or not.
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

        boolean sorted = checkSortedArray(arr);

        if (sorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }

        sc.close();
    }

    static boolean checkSortedArray(int arr[]) {
        boolean flag = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1])
                    flag = false;
        }

        return flag;
    }
    
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}