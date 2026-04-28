/*
Ques: Two Sum
*/

import java.util.Scanner;

class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int idx1 = -1, idx2 = -1;

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    idx1 = i;
                    idx2 = j;
                    flag = true;
                    break;
                }
            }
        }

        // ! This approach is not correct, i assumed that all valid pair will reside on both the halfs of array but this assumption is not correct
        // for(int i = 0; i <= arr.length/2; i++){
        //     for (int j = arr.length - 1; j >= arr.length/2; j--) {
        //         if (arr[i] + arr[j] == target) {
        //             idx1 = i;
        //             idx2 = j;
        //             flag = true;
        //             break;
        //         }
        //     }
        // }
        if (flag)
            System.out.println("Two sum exists at (" + idx1 + "," + idx2 + ").");
        else
            System.out.println("Does not exist");

        sc.close();
    }
}
