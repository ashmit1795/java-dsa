/*
Ques: Reverse a part of an array
*/

import java.util.Scanner;

class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter start index: ");
        int startIdx = sc.nextInt();
        System.out.print("Enter end index: ");
        int endIdx = sc.nextInt();


        int i = startIdx, j = endIdx;
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
