/*
Ques: Print the given pattern

* Star Triangle Vertically Flipped

    1 2 3 4
1         *
2       * *
3     * * *
4   * * * *

OR

    1 2 3 4
1         1
2       2 1
3     3 2 1
4   4 3 2 1

OR

    1 2 3 4
1         A
2       B B
3     C C C
4   D D D D
*/

import java.util.Scanner;

class program17 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // for (int k = 1; k <= i; k++) {
            //     System.out.print(" *");
            // }
            // for (int k = i; k >= 1; k--) {
            //     System.out.print(" " + k);
            // }

            for (int k = i; k >= 1; k--) {
                System.out.print(" " + (char)(64 + i));
            }

            System.out.println();
        }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if ((i + j) > n)
        //             System.out.print(" *");
        //         else
        //             System.out.print("  ");
        //     }
        //     System.out.println();
        // }
        
        sc.close();
    }
}
