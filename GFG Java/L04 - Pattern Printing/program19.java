/*
* Double Flipped Triangle

1   * * * * *
2     * * * *
3       * * *
4         * *
5           *
*/

import java.util.Scanner;

class program19 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (n - i + 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
