/*
Bubble sort
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

        // bubbleSort(arr);
        optimisedBubbleSort(arr);

        print(arr);

        sc.close();
    }

    static void bubbleSort(int arr[]) {
        int n = arr.length;
        int swapCount = 0, passes = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapCount++;
                }
            }
            passes++;
        }

        System.out.println("Swap Count: " + swapCount);
        System.out.println("Passes: " + passes);
    }
    
    static void optimisedBubbleSort(int arr[]){
        int n = arr.length;
        int swapCount = 0, passes = 0;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapCount++;
                    swapped = true;
                }
            }
            passes++;
            if (!swapped)
                break;
        }
        System.out.println("Swap Count: " + swapCount);
        System.out.println("Passes: " + passes);

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