/*
Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

Example 1:
Input:
    [1, 2, 4, 7, 7, 5]  
Output:
    Second Smallest : 2  
    Second Largest : 5  
Explanation:
The elements are sorted as 1, 2, 4, 5, 7, 7.  
Hence, the second smallest element is 2, and the second largest element is 5.

Example 2:
Input:
    [1]  
Output:
    Second Smallest : -1  
    Second Largest : -1  
Explanation:
Since there is only one element in the array, it is both the largest and smallest element.  
Therefore, there is no second smallest or second largest element present.
*/
public class program3 {
    public static void main(String[] args) {
        // int[] arr = { -198, 1, 2, 3, 4, 5 };
        // int[] arr = { -198, 1 };
        // int[] arr = { -1 };
        int[] arr = { 1, 1, 1, 1 };

        secondLargestAndSmallest(arr);
    }
    
    static void secondLargestAndSmallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int smax = Integer.MIN_VALUE;
        int smin = Integer.MAX_VALUE;

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == min || arr[i] == max)
                continue;
            if (arr[i] < smin)
                smin = arr[i];
            if (arr[i] > smax)
                smax = arr[i];
        }
        
        if (smax == Integer.MIN_VALUE)
            smax = -1;
        if(smin == Integer.MAX_VALUE)
            smin = -1;

        System.out.println("Second Smallest : " + smin);
        System.out.println("Second Largest : " + smax);

    }
}
