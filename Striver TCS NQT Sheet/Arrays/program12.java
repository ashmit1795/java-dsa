/*
Problem Statement: Given an unsorted array, remove duplicates from the array.

Input: arr[]={2,3,1,9,3,1,3,9}
Output: {2,3,1,9}
Explanation: Removed all the duplicate elements.

Input: arr[]={4,3,9,2,4,1,10,89,34}
Output: {4,3,9,2,1,10,89,34}
Explanation: Removed all the duplicate elements.
*/

import java.util.ArrayList;
import java.util.HashSet;

class program12 {
    public static void main(String[] args) {
        // int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
        int[] arr = { 2, 3, 1, 9, 3, 1, 3, 9 };
        
        System.out.println(removeDuplicates(arr));
    }
    
    static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> map = new HashSet<>();

        for (int ele : arr) {
            if (!map.contains(ele)) {
                result.add(ele);
                map.add(ele);
            }
        }

        return result;
    }
}
