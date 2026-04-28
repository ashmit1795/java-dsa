/*
Ques: Print sum & product of elements of the
array.
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

        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
        }

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);

        sc.close();
    }
}