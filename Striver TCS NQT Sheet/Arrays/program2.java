/*
Problem Statement: Given an array, we have to find the largest element in the array.
*/

public class program2 {
    public static void main(String[] args) {
        int[] arr = { -198, 1, 2, 3, 4, 5 };

        System.out.println("Largest element: " + arr[findLargest(arr)]);
    }
    
    static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = i;
        }

        return max;
    }
}
