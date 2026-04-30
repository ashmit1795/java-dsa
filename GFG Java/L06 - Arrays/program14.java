/*
Ques : Given an array of size n+1 consisting of
integers from 1 to n. One of the elements is
duplicate in the array. Find that duplicate element.
*/

import java.util.Scanner;

class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Missing element: " + duplicateNum(arr));

        sc.close();
    }

    static int duplicateNum(int arr[]) {
        // code here
        int n = arr.length - 1;
        int sumOfFirstN = (n * (n + 1)) / 2; // there might be overflow in case of large numbers, so multiplication is not suitable, otherwise use long data type
        int sum = 0;
        for(int i = 0; i < arr.length; i++) sum += arr[i];
        
        return (sum - sumOfFirstN);
    }
}
