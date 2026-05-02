/*
Ques: Move all zeroes to end
*/

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

        moveAllZeroes(arr);

        print(arr);

        sc.close();
    }

    static void moveAllZeroes(int arr[]) {
        int zeroesCount = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zeroesCount++;
        }

        for (int j = 0; j < zeroesCount; j++) {
            for (int i = 0; i < n-1; i++) {
                if (arr[i] == 0) {
                    swap(arr, i, i + 1);
                }
            }
        }

    }
    
    static void moveAllZeroesEfficient(int arr[]) {
        int k = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, k);
                k++;
            }
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