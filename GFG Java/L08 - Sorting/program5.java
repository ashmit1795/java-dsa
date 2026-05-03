/*
Selection Sort - Reverse Order - Largest First
*/

import java.util.Scanner;

class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        selectionSort(arr);

        print(arr);

        sc.close();
    }

    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int maxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[maxIndex])
                    maxIndex = j;
            }
            swap(arr, i, maxIndex);
        }
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}