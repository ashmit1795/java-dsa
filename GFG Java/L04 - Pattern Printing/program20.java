/*
* Pyramid

1             *
2           * * *
3         * * * * *
4       * * * * * * *

in ith row -> 2i-1 stars are getting printed
*/

import java.util.Scanner;

class program20 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= (n - i); j++) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 1; k <= 2*i-1; k++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 2nd method nsp-nst method
        int nsp = n - 1, nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
        sc.close();
    }
}
