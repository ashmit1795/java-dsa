/*
Problem Statement: Given an array of N integers, the task is to replace each element of the array by its rank in the array.

Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so.

Input: 1 5 8 15 8 25 9
Output: 1 2 3 5 3 6 4
Explanation :When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is 1,rank of 5 is 2,rank of 8 is 3 and so.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class program18 {
    public static void main(String[] args) {
        int[] arr = { 20, 15, 26, 2, 98, 6, 5, 6 };
        
        findRank(arr);
    }
    
    static void findRank(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> rankList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();

            int curr = arr[i];

            for (int j = 0; j < n; j++) {
                if (arr[j] < curr) {
                    set.add(arr[j]);
                }
            }
            int rank = set.size() + 1;
            rankList.add(rank);
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println(rankList);
    }
}
