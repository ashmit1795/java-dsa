/*
Ques: Print the second Maximum element in the array
*/

import java.util.Scanner;

class program6 {
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // ! Both the approaches are same but it has edge cases if all elements are same(but it is handled by an if-else)
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == max) {
        //         continue;
        //     }
        //     if (arr[i] > smax) {
        //         smax = arr[i];
        //     }
        // }

        if (smax == Integer.MIN_VALUE) {
            smax = max;
        }
        
        System.out.println("Second largest element = " + smax);

        sc.close();
    }
}
