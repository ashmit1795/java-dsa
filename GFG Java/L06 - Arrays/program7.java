/*
Ques: Reverse an array
*/

import java.util.Scanner;

class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        // for (int i = 0, j = n-1; i <= n/2 && j >= n/2; i++, j--) {
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }

        // for (int i = 0; i <= n/2 ; i++) {
        //     int temp = arr[i];
        //     arr[i] = arr[n - i - 1];
        //     arr[n - i - 1] = temp;
        // }

        int i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }


        for (int element : arr) {
            System.out.print(element + " ");
        }

        sc.close();
    }
}
