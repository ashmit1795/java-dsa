/*
Problem Statement: Given an array, we have to find the smallest element in the array.
*/

public class program1 {
    public static void main(String[] args) {
        int[] arr = { -198, 1, 2, 3, 4, 5 };

        System.out.println("Smallest element: " + arr[findSmallest(arr)]);
    }
    
    static int findSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min)
                min = i;
        }

        return min;
    }
}
