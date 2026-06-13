/*
Problem Statement: Given arr1[] and arr2[], we need to find whether arr1[] is a subset of arr2[]. An array is called a subset of another if all of its elements are present in the other array.

Example 1:
Input:  arr1[]= [1,3,4,5,2]
        arr2[]= [2,4,3,1,7,5,15]
Output: arr1[] is a subset of arr2[]

Example 2:
Input:  arr1[]= [1,3,4,5,2]
        arr2[]= [4,5,2]
Output: arr1[] is not a subset of arr2[]

Example 3:
Input:  arr1[]= [1,3,4,5,2]
        arr2[]= [11,12,13,15,16]
Output: arr1[] is not a subset of arr2[]
*/

import java.util.HashSet;

class program24 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5, 2, 16 };
        int[] arr2 = { 2, 4, 3, 1, 7, 5, 15 };

        System.out.println(isSubset(arr1, arr2));

    }
    
    // static boolean isSubset(int[] arr1, int[] arr2) {
    //     int n = arr1.length;
    //     int m = arr2.length;

    //     if (n > m)
    //         return false;

    //     for (int i = 0; i < n; i++) {
    //         boolean found = false;
    //         for (int j = 0; j < m; j++) {
    //             if (arr2[j] == arr1[i])
    //                 found = true;
    //         }
    //         if (!found)
    //             return false;
    //     }

    //     return true;
    // }

    static boolean isSubset(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length)
            return false;

        HashSet<Integer> set = new HashSet<>();

        for (int ele : arr2) {
            set.add(ele);
        }

        for (int ele : arr1) {
            if (!set.contains(ele))
                return false;
        }

        return true;
    }

}
