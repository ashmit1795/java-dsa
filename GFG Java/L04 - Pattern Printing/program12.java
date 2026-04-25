/*
Ques: Print the given pattern

* Star Plus

    1 2 3 4 5
1       *
2       *
3   * * * * *
4       *
5       * 
*/

import java.util.Scanner;

class program12 {
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
                if (i == (n+1) / 2 || j == (n+1) / 2) {
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
