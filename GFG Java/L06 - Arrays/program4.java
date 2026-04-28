/*
Ques: Search in Array
*/

import java.util.Scanner;

class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element " + x + " not found." );
        } else {
            System.out.println("Element " + x + " found at index " + index + ".");
        }

        sc.close();
    }
}
