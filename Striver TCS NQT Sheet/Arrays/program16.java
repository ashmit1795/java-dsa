/*
Problem Statement: Given an array of pairs, find all the symmetric pairs in the array.

Example 1:
Input:
    (1,2),(2,1),(3,4),(4,5),(5,4)
Output:
    (2,1) (5,4)
Explanation:
    Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.

Example 2:
Input:
    (1,5),(2,3),(4,2),(5,1),(2,4)
Output:
    (2,4) (5,1)
Explanation:
    Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2) are symmetric pairs.
*/

import java.util.HashMap;

class program16 {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 4, 5 }, { 5, 4 } };

        findSymmentric(arr);

    }

    // static void findSymmentric(int[][] arr) {
    //     int n = arr.length;

    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
    //                 System.out.print("(" + arr[i][1] + " " + arr[i][0] + ") ");
    //                 break;
    //             }
    //         }
    //     }
    // }

    static void findSymmentric(int[][] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        System.out.println("Symmentric Pairs: ");

        for (int i = 0; i < n; i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            if (map.containsKey(second) && map.get(second) == first) {
                System.out.println("(" + first + ", " + second + ")");
            }

            map.put(first, second);
        }
    }

}
