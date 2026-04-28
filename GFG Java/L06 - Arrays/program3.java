/*
Ques: Print the maximum element in the
array.
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

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max)
                max = arr[i];

            if (arr[i] <= min)
                min = arr[i];
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        sc.close();
    }
}