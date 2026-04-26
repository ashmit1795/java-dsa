/*
Ques: Print the given pattern

* Star Cross

n = 5
    1 2 3 4 5       i == j || n - i + 1 == j
1   * # # # *       1 == 1 || 5 - 1 + 1 == 1                      1 <-> 5
2   # * # * #       2 == 2 || 5 - 2 + 1 == 4                      2 <-> 4
3   # # * # #       3 == 3 || 5 - 3 + 1 == 3                      3 <-> 3
4   # * # * #       4 == 4 || 5 - 4 + 1 == 2                      4 <-> 2
5   * # # # *       5 == 5 || 5 - 5 + 1 == 1                      5 <-> 1
*/

import java.util.Scanner;

class program13 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n': ");
        n = sc.nextInt();
        if (n % 2 != 1) {
            sc.close();
            throw new Error("'n' should be odd.");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || (n - i + 1 == j)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
