/*
Ques: Given an Array, print negative
elements only
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

        // print negative numbers
        System.out.print("Printing negative nos. only: ");
        for (int i = 0; i < arr.length; i++)
            if(arr[i] < 0) System.out.print(arr[i] +" ");

        sc.close();

    }
}
